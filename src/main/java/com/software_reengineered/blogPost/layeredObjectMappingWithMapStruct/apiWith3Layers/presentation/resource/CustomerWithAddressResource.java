package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.resource;

public class CustomerWithAddressResource {

	private long id;

	private String firstName;

	private String lastName;

	private String customerStreet;

	private String customerPostalCode;

	public CustomerWithAddressResource(){}
	
	public String getCustomerPostalCode() {
		return customerPostalCode;
	}

	public String getCustomerStreet() {
		return customerStreet;
	}

	public String getFirstName() {
		return firstName;
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setCustomerPostalCode(String customerPostalCode) {
		this.customerPostalCode = customerPostalCode;
	}
	
	public void setCustomerStreet(String customerStreet) {
		this.customerStreet = customerStreet;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
}
