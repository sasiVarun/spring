package com.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

public class AppBatch implements ParameterizedPreparedStatementSetter<Customer> {

	@Override
	public void setValues(PreparedStatement ps, Customer customer) throws SQLException {
		ps.setString(1, customer.getCustomerId());
		ps.setString(2, customer.getCustomerName());
		ps.setString(3, customer.getCustomerAddress());
		ps.setDate(4, customer.getCustomerLocalDate());
		ps.setDate(5, customer.getCustomerLocalDateTime());
	}

}
