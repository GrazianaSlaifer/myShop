package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Order;
import com.corsojava.myshop.models.User;
import com.corsojava.myshop.repositories.UserRepository;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

       @GetMapping("/users") // gestire richieste GET
        public List<User> getUsers() {

                List<User> users = userRepository.findAll();
                return users;
        }

        @PostMapping("/users") // gestire richieste POST
        public User save(@RequestBody Order order) {
                return orderRepository.save(order);

        }


    
}
