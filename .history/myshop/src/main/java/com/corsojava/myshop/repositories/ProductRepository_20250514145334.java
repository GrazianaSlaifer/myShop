package com.corsojava.myshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.corsojava.myshop.models.Product;
import java.util.List;


@Repository
public interface ProductRepository extends
        MongoRepository<Product, String> {
    

        List<Product> findBy
}
