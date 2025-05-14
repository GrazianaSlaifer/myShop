package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.OrderRepository;

public class OrderController {

    @Autowired
    OrderRepository orderRepository;

}
