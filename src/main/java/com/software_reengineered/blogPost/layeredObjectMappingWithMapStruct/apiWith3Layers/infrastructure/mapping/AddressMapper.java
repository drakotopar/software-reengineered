package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.mapping;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.business.model.Address;
import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.entities.AddressDao;

@Mapper
public interface AddressMapper {
	
	AddressMapper INSTANCE = Mappers.getMapper( AddressMapper.class );
	
	Address toModel(AddressDao dao);
	
	AddressDao toEntity(Address model);
	
	
}
