package com.corsojava.myshop.models;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")


public class Address {

    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}
