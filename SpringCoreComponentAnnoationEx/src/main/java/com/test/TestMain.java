package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println(context.getBean("employee"));
		Employee emp = context.getBean("employee",Employee.class);
		System.out.println(emp);
		
	}

}
