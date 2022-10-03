package com.test;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public int saveCustomerUsingNamedParameterJdbcTemplate(Customer customer) {

		Map<String, Object> values = new HashMap<>();

		values.put("address", customer.getCustomerAddress());
		values.put("name", customer.getCustomerName());
		values.put("id", customer.getCustomerId());
		values.put("date", customer.getCustomerLoginDate());
		values.put("timeStamp", customer.getCustomerLoginDateTime());

		String sqlQuery = "insert into customer values(:id,:name,:address,:date,:timeStamp)";

		int recordInserted = namedParameterJdbcTemplate.update(sqlQuery, values);

		return recordInserted;
	}

	public int saveCustomerUsingNamedParameterJdbcTemplateAndSqlParameterSource(Customer customer) {

		SqlParameterSource values = new MapSqlParameterSource().addValue("customerId", customer.getCustomerId())
				.addValue("customerAddress", customer.getCustomerAddress())
				.addValue("customerName", customer.getCustomerName());
		String sqlQuery = "insert into customer values(:customerId,:customerName,:customerAddress)";

		int result = namedParameterJdbcTemplate.update(sqlQuery, values);

		return result;
	}
}
