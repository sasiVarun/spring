package com.test;

import java.util.List;

public class Department {
	private String departmentId;
	private String departmentName;
	private List<Employee> employees;
	private Organization organization;
	
	
	public Department(String departmentId, String departmentName, List<Employee> employees, Organization organization) {
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.employees = employees;
		this.organization = organization;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public Organization getOrganization() {
		return organization;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + ", employees="
				+ employees + ", organization=" + organization + "]";
	}
	
	

}
