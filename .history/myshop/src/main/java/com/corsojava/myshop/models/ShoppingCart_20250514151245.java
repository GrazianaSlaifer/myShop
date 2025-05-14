package com.corsojava.myshop.models;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "")


public class ShoppingCart {

     private List<CartItem> item;
    private User user;
}
