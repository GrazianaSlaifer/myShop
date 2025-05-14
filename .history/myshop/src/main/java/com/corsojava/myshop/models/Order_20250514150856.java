package com.corsojava.myshop.models;

import java.util.List;

public class Order {

    private int orderId;
    private User user;
    private List<CartItem> item;
    private double totalAmount;
    private Date orderDate;
    private String status;
}
