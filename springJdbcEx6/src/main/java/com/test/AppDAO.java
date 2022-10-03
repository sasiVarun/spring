package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void saveCustomerUsingParameterizedPreparedStatementSetter(List<Customer> customers) {

		String sqlQuery = "insert into customer values(?,?,?,?,?)";
		
		jdbcTemplate.batchUpdate(sqlQuery, customers, 10, new AppBatch());
		
		/* Using Lambda Function for ParameterizedPreparedStatement */
		/*
		 * jdbcTemplate.batchUpdate(sqlQuery, customers, 10, (ps,customer)->{
		 * ps.setString(1, customer.getCustomerId()); ps.setString(2,
		 * customer.getCustomerName()); ps.setString(3, customer.getCustomerAddress());
		 * ps.setDate(4, customer.getCustomerLocalDate()); ps.setDate(5,
		 * customer.getCustomerLocalDateTime()); });
		 */
		
		System.out.println("Batch Completed");
	}
	
	public void saveCustomers(List<Customer> customers) {
		
		List<SqlParameterSource> values = new ArrayList<>();
		
		for(Customer customer : customers) {
			MapSqlParameterSource value = new MapSqlParameterSource();
			value.addValue("customerid", customer.getCustomerId());
			value.addValue("customername", customer.getCustomerName());
			value.addValue("customeraddress", customer.getCustomerAddress());
			value.addValue("customerlocaldate", customer.getCustomerLocalDate());
			value.addValue("customerlocaldatetime", customer.getCustomerLocalDateTime());
			
			values.add(value);
		}
		
		String sqlQuery= "insert into customer values(:customerid,:customername,:customeraddress,:customerlocaldate,:customerlocaldatetime)";
		namedParameterJdbcTemplate.batchUpdate(sqlQuery, values.toArray(MapSqlParameterSource[]::new));
		System.out.println("Batch Completed");
	}
}
