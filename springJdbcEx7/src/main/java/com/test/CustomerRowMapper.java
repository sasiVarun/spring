package com.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CustomerRowMapper implements RowMapper<Customer>{

	@Override
	public Customer mapRow(ResultSet rs, int rowNum) throws SQLException {
		Customer customer = new Customer();
		customer.setCustomerId(rs.getString("customerid"));
		customer.setCustomerName(rs.getString("customername"));
		customer.setCustomerAddress(rs.getString("customerAddress"));
		customer.setCustomerLoginDate(rs.getDate("customerLoginDate"));
		customer.setCustomerLoginDateTime(rs.getTimestamp("customerLoginDateTime").toLocalDateTime());
//		customer.setCustomerLoginDateTime(rs.getTimestamp("customerLoginDateTime"));
		return customer;
	}
	

}
