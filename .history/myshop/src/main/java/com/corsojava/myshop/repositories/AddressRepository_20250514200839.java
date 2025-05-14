package com.corsojava.myshop.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corsojava.myshop.models.Address;
import com.corsojava.myshop.models.Product;

 @Repository
public interface AddressRepository extends
        MongoRepository<Address, String> {

 
    

        List<Product> findByCategory(String category);
}

