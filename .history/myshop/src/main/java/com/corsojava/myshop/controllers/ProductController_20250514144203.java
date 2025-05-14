package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Product;
import com.corsojava.myshop.repositories.ProductRepository;

@RestController
public class ProductController {
    
    @Autowired
    ProductRepository productRepository;
    

    @GetMapping("/products")
    public List<Product> getProducts() {
        

            List<Product> products =
                    productRepository.findAll();
            return products;
    }

    @PostMapping("/products")
        public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
}

@GetMapping("/prdosucts/{id}")
public Product geProductById(@PathVariable String id){
        return productRepository
}


}
