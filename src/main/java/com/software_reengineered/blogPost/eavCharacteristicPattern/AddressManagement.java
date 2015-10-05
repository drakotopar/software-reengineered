package com.software_reengineered.blogPost.eavCharacteristicPattern;

import java.util.Arrays;

public class AddressManagement {

	 public static void main( String[] args )
	 {
		 
		 Address address = new Address();
		 address.setPostalCode(1231456);
		 address.setStreet("Ubi avenue 1");
		 
		 
		 /**
		  * On run time : create a new attribute that was not listed on design time : prefix street
		  */
		 
		 CharacteristicSpecification prefixStreet = new CharacteristicSpecification("prefixStreet", ValueType.text);
		 prefixStreet.setDescription("prefix street");
		 prefixStreet.setMinCardinality(1);
		 prefixStreet.setMaxCardinality(1);
		 
		 /**
		  * create list of possible values
		  */
		 CharacteristicSpecValue.Factory.assignSpecValueToSpecification(prefixStreet, ValueType.text, "Jln");
		 CharacteristicSpecValue.Factory.assignSpecValueToSpecification(prefixStreet, ValueType.text, "Bsr");
		 
		 /**
		  * assign it to a specification so we know 
		  * if an entity implement this specification, 
		  * it has to implements its charactersticSpecification
		  */
		 AddressSpecification addExtends = new AddressSpecification();
		 addExtends.setCharacteristicSpecifications(Arrays.asList(prefixStreet));
		 
		 /**
		  * choose Jln value
		  */
		 CharacteristicSpecValue jlnSpecValue = addExtends.getCharacteristicSpecifications().get(0).getCharacteristicSpecValues().get(0);
		 CharacteristicValue jln = CharacteristicValue.Factory.chooseValueFromSpecValues(jlnSpecValue);
		 address.setCharacteristicValues(Arrays.asList(jln));
		 
		 System.out.println("old attributes");
		 System.out.println("postal code - " +address.getPostalCode());
		 System.out.println("street - " +address.getStreet());
		 System.out.println("");
		 System.out.println("new attributes");
		 System.out.println(
			 address.getCharacteristicValues().get(0).getCharacteristicSpecification().getName()
			 + " - " +
			 address.getCharacteristicValues().get(0).getValue()
		 );
		 
		 
	 }
}
