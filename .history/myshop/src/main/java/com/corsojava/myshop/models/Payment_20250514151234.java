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
@Document(collection = "")

public class Payment {

    private Integer paymentId;
    private User user;
    private Order order;
    private String method;
    private Boolean isSuccessful;
}
