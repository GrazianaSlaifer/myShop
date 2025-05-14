package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ProductController {
    
    @GetMapping("path")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public List<Product> getProducts() {
        return null;
    }


}
