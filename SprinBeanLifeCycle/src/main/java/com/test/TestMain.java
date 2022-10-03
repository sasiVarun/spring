package com.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String...args) {		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//		System.out.println("Bean is ready to use: "+context.getBean(Employee.class));
		context.close();
	}
}
