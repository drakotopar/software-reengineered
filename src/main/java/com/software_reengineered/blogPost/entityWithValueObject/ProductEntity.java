package com.software_reengineered.blogPost.entityWithValueObject;

public class ProductEntity {

	private String name;

	private double price;

	private String currency;
	
	public ProductEntity(String name, double price, String currency){
		this.name = name;
		this.price = price;
		this.currency = currency;
	}

	public String getCurrency() {
		return currency;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		return name+" - "+price+" "+currency;
	}
}
