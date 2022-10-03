package com.test;

import java.sql.Date;
import java.time.LocalDateTime;

public class Customer {
	private String customerId;
	private String customerName;
	private String customerAddress;
	private Date customerLoginDate;
	private LocalDateTime customerLoginDateTime;
//	private Timestamp customerLoginDateTime;

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
	
	

	public LocalDateTime getCustomerLoginDateTime() {
		return customerLoginDateTime;
	}

	public void setCustomerLoginDateTime(LocalDateTime timestamp) {
		this.customerLoginDateTime = timestamp;
	}

//	public Timestamp getCustomerLoginDateTime() {
//		return customerLoginDateTime;
//	}
//
//	public void setCustomerLoginDateTime(Timestamp customerLoginDateTime) {
//		this.customerLoginDateTime = customerLoginDateTime;
//	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAddress="
				+ customerAddress + ", customerLoginDate=" + customerLoginDate + ", customerLoginDateTime="
				+ customerLoginDateTime + "]";
	}
	
	
	
}
