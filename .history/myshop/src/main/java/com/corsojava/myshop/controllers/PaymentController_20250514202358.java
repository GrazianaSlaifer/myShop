package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Order;
import com.corsojava.myshop.models.Payment;
import com.corsojava.myshop.repositories.PaymentRepository;

@RestController
public class PaymentController {

    @Autowired
    PaymentRepository paymentRepository;

       @GetMapping("/payments") // gestire richieste GET
        public List<Payment> getPayment() {

                List<Payment> payments = paymentRepository.findAll();
                return payments;
        }

        @PostMapping("/payments") // gestire richieste POST
        public Payment savePayment(@RequestBody Payment payment) {
                return paymentRepository.save(order);

        }


}
