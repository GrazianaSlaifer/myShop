package com.corsojava.myshop.models;

import java.sql.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "")



public class Order {

    private Integer orderId;
    private User user;
    private List<CartItem> item;
    private Double totalAmount;
    private Date orderDate;
    private String status;
}
