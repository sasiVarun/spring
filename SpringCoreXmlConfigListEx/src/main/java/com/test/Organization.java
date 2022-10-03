package com.test;

public class Organization {
	private String organizationName;
	private String organizationAddress;
	public String getOrganizationName() {
		return organizationName;
	}
	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}
	public String getOrganizationAddress() {
		return organizationAddress;
	}
	public void setOrganizationAddress(String organizationAddress) {
		this.organizationAddress = organizationAddress;
	}
	@Override
	public String toString() {
		return "Organization [organizationName=" + organizationName + ", organizationAddress=" + organizationAddress
				+ "]";
	}
	
}
