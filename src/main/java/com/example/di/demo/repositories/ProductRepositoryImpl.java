package com.example.di.demo.repositories;

import java.util.Arrays;
import java.util.List;

import com.example.di.demo.models.Product;

public class ProductRepositoryImpl implements ProductoRepository {

    private List<Product> data;

    public ProductRepositoryImpl() {
        this.data = Arrays.asList(
                new Product(1L, "leche", 100L),
                new Product(2L, "pan", 200L),
                new Product(3L, "huevo", 300L));
    }

    @Override
    public List<Product> findAll() {
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
