package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Customer;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.repository.CustomerRepository;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.mapping.CustomerWithAddressMapper;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.resource.CustomerWithAddressResource;

@RestController
@RequestMapping(value = "customer3Layers")
public class CustomerController {

	@Autowired
	CustomerRepository repository;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CustomerWithAddressResource> get() {
		List<Customer> customers = repository.findAll();
		return customers.stream()
				.map(CustomerWithAddressMapper.INSTANCE::toResource).collect(Collectors.toList());
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
	public CustomerWithAddressResource create(@RequestBody Customer customer) {
			customer = repository.save(customer);
			return CustomerWithAddressMapper.INSTANCE.toResource(customer);
	}
}
