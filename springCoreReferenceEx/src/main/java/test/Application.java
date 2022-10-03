package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springBeans.Employee;

public class Application {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee emp = context.getBean("employeeOb",Employee.class);
		System.out.println("Employee Name: "+emp.getEmployeeName());
		System.out.println("Employee ID: "+emp.getEmployeeId());
//		System.out.println("Department: "+ emp.getDepartment()); // prints Department Object reference
		System.out.println("Department Name: "+emp.getDepartment().getDepartmentName());
		System.out.println("Department ID: "+emp.getDepartment().getDepartmentId());
//		System.out.println("Organization: "+ emp.getDepartment().getOrganization()); // prints Organization object reference
		System.out.println("Organization Name: "+emp.getDepartment().getOrganization().getOrganizationName());
		System.out.println("Organization Address: "+emp.getDepartment().getOrganization().getOrganizationArea());
		
	}
	
}
