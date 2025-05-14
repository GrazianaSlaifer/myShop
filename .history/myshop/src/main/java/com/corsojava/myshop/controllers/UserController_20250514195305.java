package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.UserRepository;


public class UserController {

    @Autowired
    UserRepository userRepository;

    
}
