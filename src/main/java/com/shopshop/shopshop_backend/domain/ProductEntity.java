package com.shopshop.shopshop_backend.domain;

import org.bson.types.ObjectId;

public class ProductEntity {
    private ObjectId id;
    private String name;
    private String price;
    private String stock;

    public ProductEntity() {}

    public ProductEntity(
        ObjectId id,
        String name,
        String price,
        String stock
    ) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public ObjectId getId() {
        return this.id;
    }

    public ProductEntity setId(ObjectId id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ProductEntity setName(String name) {
        this.name = name;
        return this;
    }

    public String getPrice() {
        return this.price;
    }

    public ProductEntity setPrice(String price) {
        this.price = price;
        return this;
    }

    public String getStock() {
        return this.stock;
    }

    public ProductEntity setStock(String stock) {
        this.stock = stock;
        return this;
    }


}
