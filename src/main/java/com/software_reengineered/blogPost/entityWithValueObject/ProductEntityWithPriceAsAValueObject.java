package com.software_reengineered.blogPost.entityWithValueObject;

public class ProductEntityWithPriceAsAValueObject {

	private String name;
	
	private PriceValueObject price;

	public ProductEntityWithPriceAsAValueObject(String name, PriceValueObject price){
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PriceValueObject getPrice() {
		return price;
	}

	public void setPrice(PriceValueObject price) {
		this.price = price;
	}
	
	@Override
	public String toString(){
		return name+" - "+price.getPrice()+" "+price.getCurrency();
	}
	
}
