package com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.model;

import javax.persistence.Entity;

@Entity
public class OneTimeCharge extends PriceOffering{

	protected OneTimeCharge(double price, String currency,
			int amountQuantity, String amountType) {
		super(price, currency, amountQuantity, amountType);
		this.type = "otc";
	}

}
