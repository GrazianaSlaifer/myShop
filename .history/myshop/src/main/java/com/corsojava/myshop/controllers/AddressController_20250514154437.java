package com.corsojava.myshop.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.corsojava.myshop.repositories.AddressRepository;

public class AddressController {

    @Autowired
    AddressRepository addressRepository;

}
