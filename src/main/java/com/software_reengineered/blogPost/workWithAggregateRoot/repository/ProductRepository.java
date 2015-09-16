package com.software_reengineered.blogPost.workWithAggregateRoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.software_reengineered.blogPost.workWithAggregateRoot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
