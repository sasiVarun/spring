package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AppDAO appDAO = context.getBean("appDAO",AppDAO.class);
		
		Customer customer = new Customer();
		customer.setCustomerId("C101");
		customer.setCustomerName("David");
		customer.setCustomerAddress("HYD");
		
		int result = appDAO.saveCustomer(customer);
		System.out.println("Record inserted: " + result);

	}
}
