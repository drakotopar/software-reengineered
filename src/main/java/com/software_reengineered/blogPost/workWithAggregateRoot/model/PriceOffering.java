package com.software_reengineered.blogPost.workWithAggregateRoot.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class PriceOffering {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	protected String type;
	
	private double price;
	
	private String currency;

	private int amountQuantity;

	private String amountType;

	protected PriceOffering(double price, String currency, int amountQuantity, String amountType){
		this.price = price;
		this.currency = currency;
		this.amountQuantity = amountQuantity;
		this.amountType = amountType;
	}

	public int getAmountQuantity() {
		return amountQuantity;
	}

	public String getAmountType() {
		return amountType;
	}

	public double getPrice() {
		return price;
	}

	public String getCurrency() {
		return currency;
	}

	public String getType() {
		return type;
	}

	public void setAmountQuantity(int amountQuantity) {
		this.amountQuantity = amountQuantity;
	}

	public void setAmountType(String amountType) {
		this.amountType = amountType;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	

	public static class Factory {
		
		public static PriceOffering createOtc(double price, String currency, int amountQuantity){
			return createPriceOffering("otc", price, currency, amountQuantity, "unit", null);
		}
		
		public static PriceOffering createMonthlyCharge(double price, String currency, int amountQuantity){
			return createPriceOffering("recurring", price, currency, amountQuantity, "monthly", null);
		}
		
		public static PriceOffering createPriceOffering(String type, double price, String currency, int amountQuantity, String amountType, List<PriceOffering> priceOffering){
			if(priceOffering!=null){
				return new CompositePriceOffering(price, currency, amountQuantity, amountType, priceOffering);
			} else {
				switch (type) {
				case "recurring":
					return new RecurringCharge(price, currency, amountQuantity, amountType);
				default:
					return new OneTimeCharge(price, currency, amountQuantity, amountType);
				}
			}
		}
	}
	
	
}


