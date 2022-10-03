package com.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean("department1")
	public Department department() {
		Department department = new Department();
		department.setDeptId("Dept-344");
		department.setDeptName("Finance");
		return department;
	}
	@Bean("department")
	public Department department1() {
		Department department = new Department();
		department.setDeptId("Dept-786");
		department.setDeptName("Marketing");
		return department;
	}

	@Bean
	public Employee employee() {
		Employee emp = new Employee();
		emp.setEmpId("100");
		emp.setEmpName("Ajay");
//		emp.setDepartment(department());
		return emp;
	}

}
