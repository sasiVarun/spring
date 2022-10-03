package com.test;

public class Employee {
	private String empId;
	private String empName;
	private Department department;
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		System.out.println("In dept");
		this.department = department;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", \ndepartment=" + department + "]";
	}
	

}
