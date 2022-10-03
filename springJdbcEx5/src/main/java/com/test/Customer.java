package com.test;

import java.sql.Date;

public class Customer {
	private String customerName;
	private String customerId;
	private String customerAddress;
	private Date customerLocalDate;
	private Date customerLocalDateTime;

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Date getCustomerLocalDate() {
		return customerLocalDate;
	}

	public void setCustomerLocalDate(Date customerLocalDate) {
		this.customerLocalDate = customerLocalDate;
	}

	public Date getCustomerLocalDateTime() {
		return customerLocalDateTime;
	}

	public void setCustomerLocalDateTime(Date customerLocalDateTime) {
		this.customerLocalDateTime = customerLocalDateTime;
	}

}
