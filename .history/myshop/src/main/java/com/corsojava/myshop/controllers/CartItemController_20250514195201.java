package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.CartItemRepository;

@RestController
public class CartItemController {

    @Autowired
    CartItemRepository cartItemRepository;

}
