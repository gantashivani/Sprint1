package com.capgemini.go.dto;

public class AdminDTO {

	private int retailerId;
	private String retailerName;

	
	public AdminDTO( String retailerName) {
		super();
		//this.retailerId = retailerId;
		this.retailerName = retailerName;
	}
	public int getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
}
