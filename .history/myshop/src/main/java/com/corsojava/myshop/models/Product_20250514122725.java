package com.corsojava.myshop.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor


public class Product {

    private Integer id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String category;





    
}

