package com.software_reengineered.blogPost.eavCharacteristicPattern;

import java.util.List;

public class Address {

	private String street;
	
	private int postalCode;
	
	private AddressSpecification addressSpecification;
	
	private List<CharacteristicValue> characteristicValues;

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public List<CharacteristicValue> getCharacteristicValues() {
		return characteristicValues;
	}

	public void setCharacteristicValues(
			List<CharacteristicValue> characteristicValues) {
		this.characteristicValues = characteristicValues;
	}

	public AddressSpecification getAddressSpecification() {
		return addressSpecification;
	}

	public void setAddressSpecification(AddressSpecification addressSpecification) {
		this.addressSpecification = addressSpecification;
	}
}
