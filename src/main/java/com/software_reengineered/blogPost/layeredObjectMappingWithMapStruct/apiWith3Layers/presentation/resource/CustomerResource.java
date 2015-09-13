package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.resource;

public class CustomerResource {

	private long id;

	private String firstName;

	private String lastName;
	
	public CustomerResource(){}
	
	public String getFirstName() {
		return firstName;
	}

	public long getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
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
