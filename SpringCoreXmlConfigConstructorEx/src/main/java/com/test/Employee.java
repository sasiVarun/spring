package com.test;

public class Employee {
	private String employeeId;
	private String employeeName;
	private Department department;
	
	public Employee(String employeeId, String employeeName, Department department) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Department getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}
	

}
