package com.test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAO appDAO = context.getBean(AppDAO.class);
		
		List<Customer> customers = new ArrayList<>();
		for(int i=1; i<=100; i++) {
			Customer customer = new Customer();
			customer.setCustomerId("Id"+i);
			customer.setCustomerName("Name"+i);
			customer.setCustomerAddress("Addr"+i);
			customer.setCustomerLocalDate(new Date(System.currentTimeMillis()));
			customer.setCustomerLocalDateTime(new Date(System.currentTimeMillis()));
			
			customers.add(customer);
		}
		
		appDAO.saveCustomerUsingParameterizedPreparedStatementSetter(customers);
//		appDAO.saveCustomers(customers);
	}
}
