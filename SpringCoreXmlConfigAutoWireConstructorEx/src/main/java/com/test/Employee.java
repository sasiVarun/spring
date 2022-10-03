package com.test;

public class Employee {
	private String empName;
	private String empId;
	private Department department;

	public Employee(Department department) {
		this.department = department;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", department=" + department + "]";
	}

	
}
