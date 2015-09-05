package com.software_reengineered.blogPost.entityWithValueObject;

public class PriceValueObject {

	private final double price;

	private final String currency;
	
	private PriceValueObject(double price, String currency){
		this.price = price;
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	public double getPrice() {
		return price;
	}
	
	public static PriceValueObject createNewInstance(double price, String currency)
    {
        return new PriceValueObject(price, currency);
    }
 
}
