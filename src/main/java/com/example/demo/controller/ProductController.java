package com.example.demo.controller;

// controller works as an entry point for the application. It handles HTTP requests.

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// @RestController --> combines @Controller + @ResponseBody --> Returns data as JSON.
@RestController
@RequestMapping("/products") // Base URL for all API's
public class ProductController {

    // Constructor injection.
    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    // CRUD operations in postman.

    @PostMapping  // create; URL : POST /products
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping // read all; URL : GET /products
    public List<Product> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}") // get by id; URL : GET /products/1
        public Product getById(@PathVariable Long id) {
            return service.getById(id);
        }

    @DeleteMapping("/{id}") // delete; URL : DELETE /products/1
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
