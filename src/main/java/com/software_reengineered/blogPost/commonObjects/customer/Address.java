package com.software_reengineered.blogPost.commonObjects.customer;

public class Address {

	private String street;
	
	private String postalCode;

	public Address(){}
	
	public Address(String street, String postalCode){
		this.street = street;
		this.postalCode = postalCode;
	}
	
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
}
