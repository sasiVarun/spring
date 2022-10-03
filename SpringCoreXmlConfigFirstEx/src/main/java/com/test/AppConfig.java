package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppConfig {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		LoanTaxCalculator ob = (LoanTaxCalculator)context.getBean("loanTaxCalculator");
		System.out.println(ob.rateOfInterest());
	}
}
