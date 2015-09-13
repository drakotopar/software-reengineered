package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Customer;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.entities.CustomerDao;

@Mapper(uses=AddressMapper.class)
public interface CustomerMapper {

	CustomerMapper INSTANCE = Mappers.getMapper( CustomerMapper.class );
	
	Customer toModel(CustomerDao dao);
	
	CustomerDao toEntity(Customer customer);
	
}
