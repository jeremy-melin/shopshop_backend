package com.shopshop.shopshop_backend.dtos;

import org.bson.types.ObjectId;

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

    public ProductEntity toProductEntity() {
        ObjectId _id = id == null ? new ObjectId() : new ObjectId(id);
        return new ProductEntity(_id, name, stock, price);
    }
}
