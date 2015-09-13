package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.repositorySupport;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Customer;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.repository.CustomerRepository;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.entities.CustomerDao;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.mapping.CustomerMapper;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.repository.CustomerJpaRepository;


@Component
public class CustomerRepositoryImpl implements CustomerRepository {

	@Autowired 
	CustomerJpaRepository repository;
	
	@Override
	public Customer save(Customer customer) {
		CustomerDao customerDao = CustomerMapper.INSTANCE.toEntity(customer);
		customerDao = repository.save(customerDao);
		return CustomerMapper.INSTANCE.toModel(customerDao);
	}
	
	@Override
	public List<Customer> findAll() {
		List<CustomerDao> customerDaos = repository.findAll();
		return customerDaos.stream().map(CustomerMapper.INSTANCE::toModel).collect(Collectors.toList());
	}

	
}
