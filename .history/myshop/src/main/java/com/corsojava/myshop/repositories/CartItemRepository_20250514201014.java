package com.corsojava.myshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corsojava.myshop.models.CartItem;

@Repository
public interface CartItemRepository extends MongoRepository<CartItem, String> {

    
} CartItemRepository {

}
