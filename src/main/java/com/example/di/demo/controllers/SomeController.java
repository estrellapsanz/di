package com.example.di.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.di.demo.models.Product;
import com.example.di.demo.services.ProductServiceImpl;

@RestController
@RequestMapping("/api")
public class SomeController {

    private ProductServiceImpl productService = new ProductServiceImpl();

    @GetMapping
    public List<Product> list() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return productService.findById(id);
    }
}
