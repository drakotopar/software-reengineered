package com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.model;

import java.util.List;

public class CompositePriceOffering extends PriceOffering{

	private List<PriceOffering> priceOfferings;
	
	protected CompositePriceOffering(double price, String currency,
			int amountQuantity, String amountType, List<PriceOffering> priceOfferings) {
		super(price, currency, amountQuantity, amountType);
		this.type = "composite";
		this.setPriceOfferings(priceOfferings);
	}

	public List<PriceOffering> getPriceOfferings() {
		return priceOfferings;
	}

	public void setPriceOfferings(List<PriceOffering> priceOfferings) {
		this.priceOfferings = priceOfferings;
	}

}
