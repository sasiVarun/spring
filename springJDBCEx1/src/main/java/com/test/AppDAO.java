package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AppDAO {
	/*
	 * To implement Database operations, JdbcTemplate is mandatory
	 * So we have to inject already created JdbcTemplate object.
	 * This can be achieved using @Autowired annotation 
	 */
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	/* calling this method from main class */
	public int saveCustomer(Customer customer) {
		String customerId = customer.getCustomerId();
		String customerName = customer.getCustomerName();
		String customerAddress = customer.getCustomerAddress();
		
		int recordInserted = jdbcTemplate.update("insert into customer values(?,?,?)",customerId,customerName,customerAddress);
		
		return recordInserted;
	}

}
