package com.corsojava.myshop.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "addresses")


public class Address {

    @Id
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
