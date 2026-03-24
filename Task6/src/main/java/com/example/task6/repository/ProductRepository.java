package com.example.task6.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.task6.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}