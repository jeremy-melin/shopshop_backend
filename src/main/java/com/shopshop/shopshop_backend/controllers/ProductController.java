package com.shopshop.shopshop_backend.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;

import com.shopshop.shopshop_backend.dtos.ProductDTO;
import com.shopshop.shopshop_backend.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    private ProductController(ProductService service) {
        this.productService = service;
    }

    @GetMapping("/{id}")
    private ResponseEntity<String> getProduct(@PathVariable Long id) {
        return ResponseEntity.ok("youpi");
    }

    @GetMapping("/all")
    public List<ProductDTO> getAllProducts() {
        return this.productService.findAll();
    }
}