package com.test;

public class Department {
	private String departmentId;
	private String departmentName;
	
	public Department() {
		System.out.println("Inside Department Constructor");
	}
	
	public void setDepartmentId(String departmentId) {
		System.out.println("Inside set dept id");
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		System.out.println("Inside set dept name");
		this.departmentName = departmentName;
	}


	public String getDepartmentId() {
		return departmentId;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}

}
