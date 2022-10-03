package com.test;

public class Organization {
	private String organizationName;
	private String organizationCity;
	public Organization() {
		System.out.println("Organization Constructor");
	}
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		System.out.println("Inside set organizationName");
		this.organizationName = organizationName;
	}
	public String getOrganizationCity() {
		return organizationCity;
	}
	public void setOrganizationCity(String organizationCity) {
		this.organizationCity = organizationCity;
	}
	@Override
	public String toString() {
		return "Organization [organizationName=" + organizationName + ", organizationCity=" + organizationCity + "]";
	}
	
}
