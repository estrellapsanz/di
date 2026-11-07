package com.example.di.demo.repositories;

import java.util.Arrays;
import java.util.List;

import com.example.di.demo.models.Product;

public class ProductRepository {

    private List<Product> data;

    public ProductRepository() {
        this.data = Arrays.asList(
                new Product(1L, "leche", 100L),
                new Product(2L, "pan", 200L),
                new Product(3L, "huevo", 300L));
    }

    public List<Product> findAll() {
        return data;
    }

    public Product findById(Long id) {
        return data.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
