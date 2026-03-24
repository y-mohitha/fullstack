package com.example.task6.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.example.task6.model.Product;
import com.example.task6.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService service;

    // POST
    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        Product saved = service.saveProduct(product);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<Product>> getAll() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    // GET BY ID (PathVariable)
    @GetMapping("/{id}")
    public ResponseEntity<Product> getById(@PathVariable Long id) {
        return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        service.deleteProduct(id);
        return new ResponseEntity<>("Deleted Successfully", HttpStatus.OK);
    }

    // RequestParam Example
    @GetMapping("/search")
    public ResponseEntity<String> searchByName(@RequestParam String name) {
        return new ResponseEntity<>("Searching product: " + name, HttpStatus.OK);
    }
}