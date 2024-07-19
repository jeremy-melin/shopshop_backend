package com.shopshop.shopshop_backend.repositories;

import org.springframework.stereotype.Repository;

import com.shopshop.shopshop_backend.domain.ProductEntity;

import java.util.List;

@Repository
public interface ProductRepository {
    List<ProductEntity> findAll();
}
