package com.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAO appDAO = context.getBean(AppDAO.class);
		
		List<Customer> customers = new ArrayList<>();
		
		for(int i = 1 ; i<=10 ; i++) {
			Customer customer = new Customer();
			customer.setCustomerId("ID"+i);
			customer.setCustomerName("N"+i);
			customer.setCustomerAddress("A"+i);
			customer.setCustomerLocalDate(new java.sql.Date(System.currentTimeMillis()));
			customer.setCustomerLocalDateTime(new java.sql.Date(System.currentTimeMillis()));
			customers.add(customer);
		}
		
//		appDAO.saveCustomersUsingNamedParameterJdbcTemplate(customers);
		appDAO.saveCustomersUsingJdbcTemplate(customers);
	}

}
