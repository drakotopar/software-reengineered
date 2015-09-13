package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith1Layer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith1Layer.model.Customer;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith1Layer.repository.CustomerRepository;


@RestController
@RequestMapping(value = "customer1Layer")
public class CustomerController1Layer {

	@Autowired
	CustomerRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> get() {
		List<Customer> customers = repository.findAll();
		return customers;
	}
	
	/**
	 * Example
	 * {
			"firstName": "toto", 
			"lastName":"tutu",
			"address":{
			"street":"Ubi avenue 3",
			"postalCode":"123123"
			}
		}
	 */
	@RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public Customer create(@RequestBody Customer customer) {
			customer = repository.save(customer);
			return customer;
	}
}
