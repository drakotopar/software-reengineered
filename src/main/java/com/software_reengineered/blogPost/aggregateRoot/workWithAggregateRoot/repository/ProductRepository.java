package com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software_reengineered.blogPost.aggregateRoot.workWithAggregateRoot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
