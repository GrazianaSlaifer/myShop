package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Product;
import com.corsojava.myshop.repositories.ProductRepository;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    

    @GetMapping("/products")
    public List<Product> getProducts() {
        return null;


            List<Product> products =
                    
    }


}
