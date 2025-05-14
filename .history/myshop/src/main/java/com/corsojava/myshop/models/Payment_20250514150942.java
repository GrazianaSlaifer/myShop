package com.corsojava.myshop.models;

public class Payment {

    private int paymentId;
    private User user;
    private Order order;
    private String method;
    private boolean isSuccessful;
}
