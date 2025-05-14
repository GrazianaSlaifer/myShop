package com.corsojava.myshop.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corsojava.myshop.models.Product;

public class AddressRepository {

    @Repository
public interface AddressRepository extends
        MongoRepository<Product, String> {
    

        List<Product> findByCategory(String category);
}
}
