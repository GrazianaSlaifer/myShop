package com.corsojava.myshop.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.models.Address;
import com.corsojava.myshop.models.Product;
import com.corsojava.myshop.repositories.AddressRepository;

@RestController
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

     @GetMapping("/adresses") // gestire richieste GET
        public List<Address> getAddresses() {

                List<Address> addresses = addressRepository.findAll();
                return addresses;
        }

        @PostMapping("/addresses") // gestire richieste POST
        public Address savAddress(@RequestBody Add product) {
                return productRepository.save(product);

        }

}
