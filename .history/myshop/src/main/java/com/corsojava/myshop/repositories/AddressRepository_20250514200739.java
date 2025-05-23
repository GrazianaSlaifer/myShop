package com.corsojava.myshop.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corsojava.myshop.models.Product;

public interface AddressRepository {

    @Repository
public interface ProductRepository extends
        MongoRepository<Product, String> {
    

        List<Product> findByCategory(String category);
}
}
