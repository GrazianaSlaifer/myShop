package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.UserRepository;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    
}
