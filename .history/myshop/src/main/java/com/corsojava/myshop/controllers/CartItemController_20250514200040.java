package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.CartItem;
import com.corsojava.myshop.models.Product;
import com.corsojava.myshop.repositories.CartItemRepository;

@RestController
public class CartItemController {

    @Autowired
    CartItemRepository cartItemRepository;


     @GetMapping("/cartItems") // gestire richieste GET
        public List<CartItem> gCartItems() {

                List<CartItem> carItems = cartItemRepository.findAll();
                return carItems;
        }

        @PostMapping("/cart") // gestire richieste POST
        public Product saveProduct(@RequestBody Product product) {
                return productRepository.save(product);

        }
}
