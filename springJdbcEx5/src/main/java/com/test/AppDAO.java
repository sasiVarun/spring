package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Autowired
	private NamedParameterJdbcTemplate namedParamterJdbcTemplate;

	public void saveCustomersUsingJdbcTemplate(List<Customer> customers) {
		String sqlQuery = "insert into customer values(?,?,?,?,?)";
		jdbcTemplate.batchUpdate(sqlQuery, new AppBatchUpdate(customers));
		System.out.println("Done batch update");

	}

	public void saveCustomersUsingNamedParameterJdbcTemplate(List<Customer> customers) {
		SqlParameterSource[] values = new MapSqlParameterSource[customers.size()];

		for (SqlParameterSource value : values) {
			int count = 0;
			for (Customer customer : customers) {
				value = new MapSqlParameterSource().addValue("customerId", customer.getCustomerId())
						.addValue("customerName", customer.getCustomerName())
						.addValue("customerAddress", customer.getCustomerAddress())
						.addValue("customerLocalDate", customer.getCustomerLocalDate())
						.addValue("customerLocalDateTime", customer.getCustomerLocalDateTime());
				values[count++] = value;
			}
		}

		String sqlQuery = "insert into customer values(:customerId,:customerName,:customerAddress,:customerLocalDate,:customerLocalDateTime)";
		namedParamterJdbcTemplate.batchUpdate(sqlQuery, values);
		System.out.println("Done batch update");
	}

}
