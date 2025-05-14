package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.repositories.UserRepository;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    
}
