package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.repository;

import java.util.List;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Customer;

public interface CustomerRepository {
	
	Customer save(Customer customer);
	
	List<Customer> findAll();
}
