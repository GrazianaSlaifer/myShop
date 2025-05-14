package com.corsojava.myshop.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Product;
import com.corsojava.myshop.repositories.ProductRepository;

@RestController //la classe gestisce richieste HTTP (ad esempio GET, POST, PUT, DELETE) e che i metodi restituiscono direttamente dati
public class ProductController {
    
@Autowired //importare la classe al posto di = new blablabla
ProductRepository productRepository;
    

@GetMapping("/products") //gestire richieste GET
public List<Product> getProducts() {
        
List<Product> products =
        productRepository.findAll();
        return products;
    }
        
@PostMapping("/products") //gestire richieste POST
        public Product saveProduct(@RequestBody Product product){
        return productRepository.save(product);
        
}

@GetMapping("/products/{id}")
public Optional<Product> geProductById(@PathVariable String id){
        return productRepository.findById(id);
}


}
