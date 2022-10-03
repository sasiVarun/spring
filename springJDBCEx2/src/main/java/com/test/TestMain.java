package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {

	public static void main(String args[]) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		AppDAO bean = context.getBean(AppDAO.class);
		Customer customer = new Customer();
		customer.setCustomerId("C102");
		customer.setCustomerName("Rahul");
		customer.setCustomerAddress("BNGLR");

		int result = bean.saveCustomerUsingSimpleJdbcInsert(customer);
		System.out.println("Record Inserted: " + result);
	}

}
