package com.example.di.demo.services;

import java.util.List;

import com.example.di.demo.models.Product;

public interface ProductService {
    List<Product> getAllProducts();

    Product findById(Long id);
}
