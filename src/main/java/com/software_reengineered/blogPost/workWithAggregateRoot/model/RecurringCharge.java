package com.software_reengineered.blogPost.workWithAggregateRoot.model;

import javax.persistence.Entity;

@Entity
public class RecurringCharge extends PriceOffering{

	protected RecurringCharge(double price, String currency,
			int amountQuantity, String amountType) {
		super(price, currency, amountQuantity, amountType);
		this.type = "recurring";
	}

}
