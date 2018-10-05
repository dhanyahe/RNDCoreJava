package com.collections.CarParkingAssignment.model;

public class Customer {
	
	String customerName;
	String phoneNumber;
	
	public Customer(String customerName, String phoneNumber) {
		super();
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return "CustomerDetails [customerName=" + customerName + ", phoneNumber=" + phoneNumber + "]\n";
	}
	
	

}
