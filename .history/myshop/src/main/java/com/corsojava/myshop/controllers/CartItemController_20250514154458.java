package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.CartItemRepository;

public class CartItemController {

    @Autowired
    CartItemRepository cartItemRepository;

}
