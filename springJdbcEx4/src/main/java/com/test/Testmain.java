package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Testmain {
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAO appDAO = context.getBean(AppDAO.class);
		
		Customer customer = new Customer();
		
		customer.setCustomerId("102");
//		customer.setCustomerAddress("ASSAM");
		
//		int record = appDAO.updateCustomer(customer);
		int record = appDAO.deleteCustomer(customer);
		System.out.println("Record updated:"+record);
	}
}
