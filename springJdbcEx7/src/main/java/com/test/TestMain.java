package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		AppDAO appDAO = context.getBean(AppDAO.class);
		EmployeeDAO empDAO = context.getBean(EmployeeDAO.class);
		
		int count = appDAO.getCustomerCount();
		System.out.println("Number of records in Customer Table: "+ count);
		
		String customer = appDAO.getCustomerName("Id28");
		
		System.out.println(customer);
		
		String customerAddress = appDAO.getCustomerAddress("Id21", "Name21");
		System.out.println(customerAddress);
		
		Customer customerRecord = appDAO.getCustomerById("Id21");
		System.out.println(customerRecord);
		
		System.out.println("==================================================");
		
		List<Employee> employees = empDAO.getSalaryGreaterThanAvgSalary();
		employees.forEach(employee->{
			System.out.println("EmployeeId: "+employee.getEmployeeId());
			System.out.println("EmployeeName: "+employee.getEmployeeName());
			System.out.println("EmployeeSalary: "+employee.getEmployeeSalary());
			System.out.println("==================================================");
		});
		
	}
}
