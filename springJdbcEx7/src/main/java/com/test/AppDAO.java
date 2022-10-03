package com.test;

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

	public int getCustomerCount() {
		String sqlQuery = "select count(*) from customer";
		int count = jdbcTemplate.queryForObject(sqlQuery, Integer.class);
		return count;
	}

	public String getCustomerName(String customerId) {
		String sqlQuery = "select customerName from customer where customerid = ?";
		String customerName = jdbcTemplate.queryForObject(sqlQuery, String.class, customerId);
		return customerName;
	}

	public String getCustomerAddress(String customerId, String customerName) {
		SqlParameterSource values = new MapSqlParameterSource()
										.addValue("customerId", customerId)
										.addValue("customerName", customerName);
		
		String sqlQuery = "select customeraddress from customer where customerId=:customerId and customerName=:customerName";
		String customerAddress = namedParameterJdbcTemplate.queryForObject(sqlQuery, values, String.class);
		return customerAddress;
	}
	
	public Customer getCustomerById(String customerId) {
		String sqlQuery = "select * from customer where customerId=?";		
		Customer customer = jdbcTemplate.queryForObject(sqlQuery, new CustomerRowMapper(),customerId);			
		return customer;
	}
}
