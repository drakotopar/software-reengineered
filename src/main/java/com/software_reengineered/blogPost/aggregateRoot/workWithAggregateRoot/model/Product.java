package com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private final String name;
	
	@OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private PriceOffering priceOffering;
	
	public Product(String name){
		this.name = name;
	}

	public Product(String name, PriceOffering priceOffering){
		this(name);
		this.priceOffering = priceOffering;
	}

	public String getName() {
		return name;
	}
	
	public void setPriceOffering(PriceOffering priceOffering) {
		this.priceOffering = priceOffering;
	}

	public PriceOffering getPriceOffering() {
		return priceOffering;
	}

	
}
