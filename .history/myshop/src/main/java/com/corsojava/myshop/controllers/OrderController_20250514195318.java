package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.repositories.OrderRepository;

@RestController
public class OrderController {

    @Autowired
    OrderRepository orderRepository;

}
