package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	private String empId;
	private String empName;
	@Autowired
	@Qualifier("department1")
	private Department department;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
//		System.out.println("Inside set empId");
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
//		System.out.println("Inside set empName");
	}

	public Department getDepartment() {
		return department;
	}

//	public void setDepartment(Department department) {
//		this.department = department;
//		System.out.println("Inside set department");
//	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", department=" + department + "]";
	}

}
