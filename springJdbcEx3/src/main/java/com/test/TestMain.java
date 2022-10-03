package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAO appDao = context.getBean(AppDAO.class);
		
		Customer customer = new Customer();
		customer.setCustomerId("C108");
		customer.setCustomerName("Vicky");
		customer.setCustomerAddress("KOLKATA");
		customer.setCustomerLoginDate(new java.util.Date());
		customer.setCustomerLoginDateTime(new java.util.Date());
		
		int result = appDao.saveCustomerUsingNamedParameterJdbcTemplate(customer);
//		int result = appDao.saveCustomerUsingNamedParameterJdbcTemplateAndSqlParameterSource(customer);
		System.out.println("Records Inserted: " + result);
	}

}
