package com.corsojava.myshop.models;




public class Payment {

    private Integer paymentId;
    private User user;
    private Order order;
    private String method;
    private Boolean isSuccessful;
}
