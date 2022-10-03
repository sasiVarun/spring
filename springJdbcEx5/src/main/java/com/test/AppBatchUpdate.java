package com.test;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;

public class AppBatchUpdate implements BatchPreparedStatementSetter {
	
	private List<Customer> customers;
	
	public AppBatchUpdate(List<Customer> customers) {
		this.customers = customers;
	}

	@Override
	public void setValues(PreparedStatement ps, int index) throws SQLException {
		ps.setString(1, customers.get(index).getCustomerId());
		ps.setString(2, customers.get(index).getCustomerName());
		ps.setString(3, customers.get(index).getCustomerAddress());
		ps.setDate(4, customers.get(index).getCustomerLocalDate());
		ps.setDate(5, customers.get(index).getCustomerLocalDateTime());
	}

	@Override
	public int getBatchSize() {
		return customers.size();
	}

}
