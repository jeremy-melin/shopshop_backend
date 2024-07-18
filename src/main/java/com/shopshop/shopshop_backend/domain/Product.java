package com.shopshop.shopshop_backend.domain;


public class Product {
    private Long id;
    private String name;
    private Number price;
    private Number stock;

    Product() {}
    
    Product(String name, Number price, Number stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return this.name;
    }

    public Number getPrice() {
        return this.price;
    }

    public Number getStock() {
        return this.stock;
    }

}