package com.test;

public class Employee {
	private String employeeId;
	private String employeeName;
	private Department department;
	public Employee() {
		System.out.println("Employee Constructor");
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		System.out.println("Inside set employeeId");
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", \ndepartment=" + department
				+ "]";
	}
	
	
}
