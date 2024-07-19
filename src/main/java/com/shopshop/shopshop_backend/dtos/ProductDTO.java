package com.shopshop.shopshop_backend.dtos;

import com.shopshop.shopshop_backend.domain.ProductEntity;

public record ProductDTO(
    String id,
    String name,
    String stock,
    String price
) {
    public ProductDTO(ProductEntity product) {
        this("0", product.getName(), product.getStock(), product.getPrice());
    }
}
