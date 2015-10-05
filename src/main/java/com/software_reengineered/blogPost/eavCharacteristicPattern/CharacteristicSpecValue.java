package com.software_reengineered.blogPost.eavCharacteristicPattern;



public class CharacteristicSpecValue {

	public static class Factory {
		public static CharacteristicSpecValue assignSpecValueToSpecification(CharacteristicSpecification characteristicSpecification,ValueType valueType, String value){
			return new CharacteristicSpecValue(characteristicSpecification, valueType, value);
		}
	}
	private ValueType valueType;

	private boolean isDefault;

	private String value;

	private String unitOfMeasure;

	private String valueFrom;

	private String valueTo;

	private String rangeInterval;
	
	private CharacteristicSpecification characteristicSpecification;

	private CharacteristicSpecValue(
			CharacteristicSpecification characteristicSpecification,
			ValueType valueType, String value){
		setCharacteristicSpecification(characteristicSpecification);
		this.valueType = valueType;
		this.value = value;
	}
	
	public CharacteristicSpecification getCharacteristicSpecification() {
		return characteristicSpecification;
	}

	public String getRangeInterval() {
		return rangeInterval;
	}

	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}

	public String getValue() {
		return value;
	}

	public String getValueFrom() {
		return valueFrom;
	}

	public String getValueTo() {
		return valueTo;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public boolean isDefault() {
		return isDefault;
	}

	public void setCharacteristicSpecification(
			CharacteristicSpecification characteristicSpecification) {
		this.characteristicSpecification = characteristicSpecification;
		characteristicSpecification.addCharacteristicSpecValue(this);
	}

	public void setDefault(boolean isDefault) {
		this.isDefault = isDefault;
	}

	public void setRangeInterval(String rangeInterval) {
		this.rangeInterval = rangeInterval;
	}

	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public void setValueFrom(String valueFrom) {
		this.valueFrom = valueFrom;
	}

	public void setValueTo(String valueTo) {
		this.valueTo = valueTo;
	}

	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}
}
