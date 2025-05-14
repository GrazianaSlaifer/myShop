package com.corsojava.myshop.models;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "")

public class CartItem {

    private Product product;
    private Integer quantity;
}
