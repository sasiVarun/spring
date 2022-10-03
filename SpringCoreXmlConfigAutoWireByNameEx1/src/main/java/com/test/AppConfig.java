package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		PgStudent pg = context.getBean("pgStudent",PgStudent.class);
		ResearchStudent research = context.getBean("researchStudent",ResearchStudent.class);
		
		System.out.println(pg);
		System.out.println("------------------------------------------------------------------------");
		System.out.println(research);
	}

}
