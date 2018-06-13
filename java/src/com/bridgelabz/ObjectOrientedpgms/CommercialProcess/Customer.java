package com.bridgelabz.ObjectOrientedpgms.CommercialProcess;

/**
 * @author bridgelabz
 *
 */
public class Customer {
	String customerName;
	long mobileNo;

	public Customer(String customerName, long mobileNo) {
		this.customerName = customerName;
		this.mobileNo = mobileNo;
	}

	public Customer() {
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

}
