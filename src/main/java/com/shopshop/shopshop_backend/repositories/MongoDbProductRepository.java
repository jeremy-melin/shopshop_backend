package com.shopshop.shopshop_backend.repositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import org.springframework.stereotype.Repository;

import com.shopshop.shopshop_backend.domain.ProductEntity;

import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MongoDbProductRepository implements ProductRepository {
    
    private MongoClient client;
    private MongoCollection<ProductEntity> collection;

    public MongoDbProductRepository(MongoClient mongoClient) {
        this.client = mongoClient;
    }
    
    @PostConstruct
    void init() {
        collection = client.getDatabase("shopshop").getCollection("products", ProductEntity.class);
    }

    @Override
    public List<ProductEntity> findAll() {
        return collection.find().into(new ArrayList<>());
    }
}