package com.software_reengineered.blogPost.eavCharacteristicPattern;


public class CharacteristicValue {
	
	public static class Factory{
		public static CharacteristicValue assignValue(
				CharacteristicSpecification characteristicSpecification,String value){
			return new CharacteristicValue(characteristicSpecification, value);
		}
		
		public static CharacteristicValue chooseValueFromSpecValues(
				CharacteristicSpecValue characteristicSpecValue){
			return new CharacteristicValue(characteristicSpecValue);
		}
		
	}
	
	private String value;

	private CharacteristicSpecValue characteristicSpecValue;

	private CharacteristicSpecification characteristicSpecification;

	private CharacteristicValue(CharacteristicSpecification characteristicSpecification,
			String value
			){
		this.characteristicSpecification = characteristicSpecification;
		this.value = value;
	}
	
	private CharacteristicValue(CharacteristicSpecValue characteristicSpecValue
			){
		this.characteristicSpecification = characteristicSpecValue.getCharacteristicSpecification();
		this.value = characteristicSpecValue.getValue();
	}
	
	public CharacteristicSpecification getCharacteristicSpecification() {
		return characteristicSpecification;
	}

	public CharacteristicSpecValue getCharacteristicSpecValue() {
		return characteristicSpecValue;
	}

	public String getValue() {
		return value;
	}

	public void setCharacteristicSpecification(
			CharacteristicSpecification characteristicSpecification) {
		this.characteristicSpecification = characteristicSpecification;
	}

	public void setCharacteristicSpecValue(
			CharacteristicSpecValue characteristicSpecValue) {
		this.characteristicSpecValue = characteristicSpecValue;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
