package com.software_reengineered.blogPost.commonObjects.customer;

public class Person {

	private String firstName;
	
	private Address address;

	public Person(){}
	
	public Address getAddress() {
		return address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Override
	public String toString(){
		return firstName;
	}
	
}
