package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model;

public class Customer {

	private long id;
	
	private String firstName;
	
	private String lastName;
	
	private Address address;
	
	public Customer(){}
	
	public Customer(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName, Address address){
		this(firstName, lastName);
		this.setAddress(address);
	}

	public Address getAddress() {
		return address;
	}

	public String getFirstName() {
		return firstName;
	}

	
	public String getLastName() {
		return lastName;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
