package com.test;

public class Employee {
	private String employeeName;
	private String employeeId;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "\nEmployee [employeeName=" + employeeName + ", employeeId=" + employeeId + "]";
	}
	
	

}
