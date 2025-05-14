package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.corsojava.myshop.repositories.AddressRepository;

@RestController
public class AddressController {

    @Autowired
    AddressRepository addressRepository;

}
