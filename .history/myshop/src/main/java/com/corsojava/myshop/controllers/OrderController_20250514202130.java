package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.CartItem;
import com.corsojava.myshop.models.Order;
import com.corsojava.myshop.repositories.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

     @GetMapping("/orders") // gestire richieste GET
        public List<Order> getOrders() {

                List<Order> orders = orderRepository.findAll();
                return orders;
        }

        @PostMapping("/orders") // gestire richieste POST
        public CartItem savCartItem(@RequestBody CartItem cartItem) {
                return cartItemRepository.save(cartItem);

        }

}
