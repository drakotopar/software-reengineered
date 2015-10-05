package com.software_reengineered.blogPost.eavCharacteristicPattern;

import java.util.List;

public class AddressSpecification {

	private List<CharacteristicSpecification> characteristicSpecifications;

	public AddressSpecification(){
		
	}
	
	public List<CharacteristicSpecification> getCharacteristicSpecifications() {
		return characteristicSpecifications;
	}

	public void setCharacteristicSpecifications(
			List<CharacteristicSpecification> characteristicSpecifications) {
		this.characteristicSpecifications = characteristicSpecifications;
	}
}
