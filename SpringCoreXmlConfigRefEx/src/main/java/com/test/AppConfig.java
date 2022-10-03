package com.test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppConfig {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
//		Organization org = context.getBean("org",Organization.class);
//		org.setOrganizationName("CG");
//		org.setOrganizationCity("HYD");
//		
//		Department dept = context.getBean("dept",Department.class);
//		dept.setDepartmentId("D-101");
//		dept.setDepartmentName("Software");
//		dept.setOrganization(org);
		
		Employee emp = context.getBean("emp",Employee.class);
		
//		emp.setEmployeeId("E-203");
//		emp.setEmployeeName("David");
//		emp.setDepartment(dept);
//		
		System.out.println(emp.toString());
	}

}
