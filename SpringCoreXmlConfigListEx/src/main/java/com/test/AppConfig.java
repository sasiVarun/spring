package com.test;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Department dept = context.getBean("department",Department.class);
		List<Employee> employee = dept.getEmployees();
		
//		for(Employee emp: employee) {
//			System.out.println("Employee ID:" + emp.getEmployeeId());
//			System.out.println("Employee Name:" + emp.getEmployeeName());
//		}
		
//		employee.forEach(emp ->{
//			System.out.println("Employee ID:" + emp.getEmployeeId());
//			System.out.println("Employee Name:" + emp.getEmployeeName());
//		});
		
//		employee.forEach(System.out::print);
		
		
		System.out.println(dept.toString());
	}

}
