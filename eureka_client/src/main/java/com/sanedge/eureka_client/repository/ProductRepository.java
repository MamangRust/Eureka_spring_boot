package com.sanedge.eureka_client.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanedge.eureka_client.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
