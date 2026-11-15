package com.example.di.demo.services;

import java.util.List;

import com.example.di.demo.models.Product;
import com.example.di.demo.repositories.ProductRepository;

public class ProductService {

    private ProductRepository repository = new ProductRepository();

    public List<Product> findAll() {
        return repository.findAll().stream().map( 
            //me devuelve un string, por eso hay que convertirlo a una lista
            p-> {
                Double precioModificado= p.getPrice() * 0.21d;
                //p.setPrice(precioModificado.longValue());
                Product clonedProduct = (Product) p.clone();
                clonedProduct.setPrice(precioModificado.longValue());
                return clonedProduct;
            }).toList();
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }
}
