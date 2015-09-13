package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model;


public class Address {

	public static Address createNewInstance(String street, String postalCode)
    {
        return new Address(street, postalCode);
    }
	
	private long id;
	
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

	public String getStreet() {
		return street;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
