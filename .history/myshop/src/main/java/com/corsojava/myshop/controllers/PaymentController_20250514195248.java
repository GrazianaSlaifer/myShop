package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.PaymentRepository;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

}
