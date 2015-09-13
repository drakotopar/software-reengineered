package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith1Layer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class Address {

	public static Address createNewInstance(String street, String postalCode)
    {
        return new Address(street, postalCode);
    }
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
