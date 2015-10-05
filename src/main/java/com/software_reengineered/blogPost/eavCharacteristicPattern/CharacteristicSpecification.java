package com.software_reengineered.blogPost.eavCharacteristicPattern;

import java.util.ArrayList;
import java.util.List;



public class CharacteristicSpecification {

	private String name;

	private String description;

	private boolean isUnique;

	private ValueType valueType;

	private int minCardinality;

	private int maxCardinality;

	private boolean isExtensible;

	private String derivationFormula;
	
	private List<CharacteristicSpecValue> characteristicSpecValues;
	
	public CharacteristicSpecification(String name, ValueType valueType){
		this.name = name;
		this.valueType = valueType;
	}

	public String getDerivationFormula() {
		return derivationFormula;
	}

	public String getDescription() {
		return description;
	}

	public int getMaxCardinality() {
		return maxCardinality;
	}

	public int getMinCardinality() {
		return minCardinality;
	}

	public String getName() {
		return name;
	}

	public ValueType getValueType() {
		return valueType;
	}

	public boolean isExtensible() {
		return isExtensible;
	}

	public boolean isUnique() {
		return isUnique;
	}

	public void setDerivationFormula(String derivationFormula) {
		this.derivationFormula = derivationFormula;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setExtensible(boolean isExtensible) {
		this.isExtensible = isExtensible;
	}

	public void setMaxCardinality(int maxCardinality) {
		this.maxCardinality = maxCardinality;
	}

	public void setMinCardinality(int minCardinality) {
		this.minCardinality = minCardinality;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUnique(boolean isUnique) {
		this.isUnique = isUnique;
	}
	
	public void setValueType(ValueType valueType) {
		this.valueType = valueType;
	}

	public List<CharacteristicSpecValue> getCharacteristicSpecValues() {
		if(characteristicSpecValues==null){
			characteristicSpecValues = new ArrayList<CharacteristicSpecValue>();
		}
		return characteristicSpecValues;
	}

	public void setCharacteristicSpecValues(List<CharacteristicSpecValue> characteristicSpecValues) {
		this.characteristicSpecValues = characteristicSpecValues;
	}
	
	public void addCharacteristicSpecValue(CharacteristicSpecValue characteristicSpecValue) {
		getCharacteristicSpecValues().add(characteristicSpecValue);
	}
}
