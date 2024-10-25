package com.shopshop.shopshop_backend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.shopshop.shopshop_backend.dtos.ProductDTO;
import com.shopshop.shopshop_backend.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository repository) {
        this.productRepository = repository;
    }

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream().map(ProductDTO::new).toList();
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        return new ProductDTO(productRepository.save(productDTO.toProductEntity()));
    }

    @Override
    public long delete(String id) {
        return productRepository.delete(id);
    }
    
}
