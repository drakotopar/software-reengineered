package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Customer;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.presentation.resource.CustomerWithAddressResource;

@Mapper
public interface CustomerWithAddressMapper {

	CustomerWithAddressMapper INSTANCE = Mappers.getMapper( CustomerWithAddressMapper.class );
	
	@Mapping(source="address.street", target="customerStreet")
	@Mapping(source="address.postalCode", target="customerPostalCode")
	CustomerWithAddressResource toResource(Customer model);
	
}
