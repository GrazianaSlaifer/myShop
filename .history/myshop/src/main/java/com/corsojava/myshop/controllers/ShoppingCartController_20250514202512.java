package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Order;
import com.corsojava.myshop.models.ShoppingCart;
import com.corsojava.myshop.repositories.ShoppingCartRepository;

@RestController
public class ShoppingCartController {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

       @GetMapping("/shoppingcarts") // gestire richieste GET
        public List<ShoppingCart> getOrders() {

                List<Order> orders = orderRepository.findAll();
                return orders;
        }

        @PostMapping("/shoppingcarts") // gestire richieste POST
        public Order savOrder(@RequestBody Order order) {
                return orderRepository.save(order);

        }

}
