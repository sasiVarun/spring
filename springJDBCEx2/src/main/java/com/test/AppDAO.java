package com.test;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
	@Autowired
	private DataSource dataSource;

	public int saveCustomerUsingSimpleJdbcInsert(Customer customer) {
		SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(dataSource).withTableName("customer");

		Map<String, Object> parameters = new HashMap<>();

		parameters.put("customerId", customer.getCustomerId());
		parameters.put("customerName", customer.getCustomerName());
		parameters.put("customerAddress", customer.getCustomerAddress());

		int records = simpleJdbcInsert.execute(parameters);
		return records;
	}
}
