package com.example.demo.repository;

import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Database connection layer.
// JpaRepository<Product, Long> is a spring data jpa, product is entity and Long is primary key(id og table).
// By using jpa we get below methods automatically :
// save(product);         insert/update
// findAll();              get all products
// findById(id);           get one product
// deleteById(id);         delete product
public interface ProductRepository extends JpaRepository<Product, Long> {

}
