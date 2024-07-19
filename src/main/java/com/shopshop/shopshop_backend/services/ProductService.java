package com.shopshop.shopshop_backend.services;

import java.util.List;

import com.shopshop.shopshop_backend.dtos.ProductDTO;

public interface ProductService {
    List<ProductDTO> findAll();
    ProductDTO save(ProductDTO productDTO);
    long delete(String id);
}
