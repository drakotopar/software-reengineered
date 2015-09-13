package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Address;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Customer;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.repository.CustomerRepository;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = App.class)
public class CustomerManagement {

	@Autowired
	CustomerRepository repository;
	
	@Test
	public void testSaveAndFetchCustomerFromBusinessLayer()
	{
		 
		 /**
		  * create a customer at the business layer
		  */
		 Customer john = new Customer("John", "Doe", Address.createNewInstance("Ubi avenue 3", "123456"));
		 
		 repository.save(john);
		 List<Customer> customers = repository.findAll();
		 Customer customer = customers.get(0);
		 
		 System.out.println(customer.getFirstName());
		 System.out.println(customer.getLastName());
		 System.out.println(customer.getAddress().getStreet());
		 System.out.println(customer.getAddress().getPostalCode());
		 
	 }
}
