package com.shopshop.shopshop_backend.repositories;

import org.springframework.stereotype.Repository;
import com.shopshop.shopshop_backend.domain.Product;

import java.util.List;

@Repository
public interface ProductRepository {
    List<Product> findAll();
}
