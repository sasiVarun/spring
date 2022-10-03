package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println("Emp : "+emp);
		
		Employee emp1 = context.getBean("employee", Employee.class);
		System.out.println("Emp1: "+emp1);
		
		Employee emp2 = context.getBean("employee1", Employee.class);
		System.out.println("Emp2: "+emp2);
		
		Employee emp3 = context.getBean("employee1", Employee.class);
		System.out.println("Emp3: "+emp3);

	}

}
