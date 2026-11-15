package com.example.di.demo.repositories;

import java.util.List;

import com.example.di.demo.models.Product;

public interface ProductoRepository {

    List<Product> findAll();

    Product findById(Long id);
}
