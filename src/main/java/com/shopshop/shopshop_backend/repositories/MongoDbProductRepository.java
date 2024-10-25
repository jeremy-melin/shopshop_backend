package com.shopshop.shopshop_backend.repositories;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;

import org.bson.types.ObjectId;
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

    @Override
    public ProductEntity save(ProductEntity productEntity) {
        productEntity.setId(new ObjectId());
        collection.insertOne(productEntity);
        return productEntity;
    }

    @Override
    public Long delete(String id) {
        return collection.deleteOne(eq("_id", new ObjectId(id))).getDeletedCount();
    }
}