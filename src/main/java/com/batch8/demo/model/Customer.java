package com.batch8.demo.model;

public class Customer {
	
	private String cusId;
	private String  cusName;
	private String  cusAddress;
	public String getCusId() {
		return cusId;
	}
	public void setCusId(String cusId) {
		this.cusId = cusId;
	}
	public String getCusName() {
		return cusName;
	}
	public void setCusName(String cusName) {
		this.cusName = cusName;
	}
	public String getCusAddress() {
		return cusAddress;
	}
	public void setCusAddress(String cusAddress) {
		this.cusAddress = cusAddress;
	}
	public Customer(String cusId, String cusName, String cusAddress) {
		super();
		this.cusId = cusId;
		this.cusName = cusName;
		this.cusAddress = cusAddress;
	}
	
	

}
