package com.test;

import java.util.Date;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerAddress;
	private Date customerLoginDate;
	private Date customerLoginDateTime;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public Date getCustomerLoginDate() {
		return customerLoginDate;
	}

	public void setCustomerLoginDate(Date customerLoginDate) {
		this.customerLoginDate = customerLoginDate;
	}

	public Date getCustomerLoginDateTime() {
		return customerLoginDateTime;
	}

	public void setCustomerLoginDateTime(Date customerLoginDateTime) {
		this.customerLoginDateTime = customerLoginDateTime;
	}

}
