package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith1Layer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith1Layer.model.Customer;


public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}
