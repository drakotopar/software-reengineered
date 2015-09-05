package com.software_reengineered.blogPost.entityWithValueObject;

public class ProductManagement {

	 public static void main( String[] args )
	 {
		 /**
		  * product lifecycle without Value-object to control the price
		  */
		 
		 ProductEntity iphone = new ProductEntity("iphone", 1000, "USD");
		 
		 System.out.println(iphone);
		 
		 //update the price for promotion launch
		 iphone.setPrice(100);
		 System.out.println(iphone);
		 
		 //launch in Japan plus forget to update the price in the rush
		 iphone.setCurrency("Yen");
		 System.out.println(iphone);
		 
		 /**
		  * product lifecycle with Value-object to control the price
		  */
		 
		 ProductEntityWithPriceAsAValueObject iphonev2= new ProductEntityWithPriceAsAValueObject("iphone", PriceValueObject.createNewInstance(1000, "USD"));
		 System.out.println(iphonev2);
		 
		 //update the price for promotion launch
		 iphonev2.setPrice(PriceValueObject.createNewInstance(100, "USD")); // it force you to set price AND currency
		 System.out.println(iphonev2);
		 
		 //launch in Japan so try to just update the currency by a sneaky not working method of update all currency
		 String currency = iphonev2.getPrice().getCurrency();
		 currency = "Yen";
		 System.out.println(iphonev2);// does not update the currency of course
		 
		 //no choice have to set a new price with currency
		 iphonev2.setPrice(PriceValueObject.createNewInstance(10000, "Yen"));
		 System.out.println(iphonev2);
		 
		 
		 
	 }
	
}
