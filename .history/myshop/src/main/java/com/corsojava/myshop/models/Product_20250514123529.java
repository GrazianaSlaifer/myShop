package com.corsojava.myshop.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "products")


public class Product {

    private Str id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String category;





    
}

