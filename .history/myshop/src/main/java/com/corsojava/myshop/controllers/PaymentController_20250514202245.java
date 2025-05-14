package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.repositories.PaymentRepository;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

    

}
