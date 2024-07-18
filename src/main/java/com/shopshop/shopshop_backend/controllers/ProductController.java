package com.shopshop.shopshop_backend.controllers;

import com.shopshop.shopshop_backend.domain.Product;
import com.shopshop.shopshop_backend.repositories.ProductRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductRepository productRepository;

    private ProductController(ProductRepository repository) {
        this.productRepository = repository;
    }

    @GetMapping("/{id}")
    private ResponseEntity getProduct(@PathVariable Long id) {
        return ResponseEntity.ok("youpi");
    }
}