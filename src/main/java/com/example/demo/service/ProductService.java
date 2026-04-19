package com.example.demo.service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Service layer contains business logic.
@Service
public class ProductService {

    // Constructor injection.
    private final ProductRepository repo;
    // Spring automatically injects the repository here.
    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    // create
    public Product save(Product product) {
        return repo.save(product);
    }

    // read all
    public List<Product> getAll() {
        return repo.findAll();
    }

    // get by id.
    public Product getById(Long id) {
        return repo.findById(id).orElse(null);
    }

    // delete
    public void delete(Long id) {
        repo.deleteById(id);
    }
}
