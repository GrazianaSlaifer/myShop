package com.corsojava.myshop.models;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "")


public class User {

    private Integer id;
    private String name;
    private String email;
    private String password;
    private Address address;
}
