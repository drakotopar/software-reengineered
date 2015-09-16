package com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.model.PriceOffering;
import com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.model.Product;
import com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.repository.ProductRepository;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.App;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class ProductManagement {

	/**
	 * 1 repository only is needed
	 * We do not need to have a product price repository
	 */
	@Autowired
	ProductRepository repository; 
	
	@Test
	public void createProducts(){
		
		/**
		 * Create the product with a single price
		 */
		Product ifon6 = new Product("ifon6");
		ifon6.setPriceOffering(PriceOffering.Factory.createOtc(1000, "SGD", 1)); //it is way more readable with a factory than a controller
		
		ifon6 = repository.save(ifon6); 
		
		System.out.println(ifon6.getName());
		System.out.println(ifon6.getPriceOffering().getPrice()+ " "+ ifon6.getPriceOffering().getCurrency());
		System.out.println(ifon6.getPriceOffering().getAmountQuantity() + " " + ifon6.getPriceOffering().getAmountType());
		
		/**
		 * Create the product with a monthly price of $32 for 24 month
		 */
		Product ifon6Monthly = new Product("ifon6 monthly");
		ifon6Monthly.setPriceOffering(PriceOffering.Factory.createMonthlyCharge(32, "SGD", 24));
		
		ifon6Monthly = repository.save(ifon6Monthly);
		
		System.out.println(ifon6Monthly.getName());
		System.out.println(ifon6Monthly.getPriceOffering().getPrice()+ " "+ ifon6Monthly.getPriceOffering().getCurrency());
		System.out.println(ifon6Monthly.getPriceOffering().getAmountQuantity() + " " + ifon6Monthly.getPriceOffering().getAmountType());
		
	}
}
