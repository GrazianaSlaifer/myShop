package com.corsojava.myshop.models;


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
