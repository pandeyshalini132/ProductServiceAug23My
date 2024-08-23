package com.example.ProductService.services;

import com.example.ProductService.models.Product;

public class FakeStoreProductService implements ProductService{
    @Override
    public Product getProductById(int id) {
        return null;
    }
}
