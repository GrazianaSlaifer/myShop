package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.corsojava.myshop.models.CartItem;
import com.corsojava.myshop.repositories.CartItemRepository;

@RestController
public class CartItemController {

    @Autowired
    CartItemRepository cartItemRepository;


     @GetMapping("/cartItems") // gestire richieste GET
        public List<CartItem> getCartItems() {

                List<CartItem> cartItems = cartItemRepository.findAll();
                return cartItems;
        }

        @PostMapping("/cartItems") // gestire richieste POST
        public CartItem saveCartItem(@RequestBody CartItem cartItem) {
                return cartItemRepository.save(cartItem);

        }
}
