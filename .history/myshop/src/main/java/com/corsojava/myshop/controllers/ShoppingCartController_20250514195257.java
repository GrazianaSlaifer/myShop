package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.ShoppingCartRepository;

@RestController
public class ShoppingCartController {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;

}
