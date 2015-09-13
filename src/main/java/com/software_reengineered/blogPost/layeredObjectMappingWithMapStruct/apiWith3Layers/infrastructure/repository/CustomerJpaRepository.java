package com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software_reengineered.blogPost.layeredObjectMappingWithMapStruct.apiWith3Layers.infrastructure.entities.CustomerDao;

public interface CustomerJpaRepository extends JpaRepository<CustomerDao, Long>{

}
