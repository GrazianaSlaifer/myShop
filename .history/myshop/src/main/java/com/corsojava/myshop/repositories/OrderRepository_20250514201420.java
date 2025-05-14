package com.corsojava.myshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.corsojava.myshop.models.Order;

@Repository
public interface OrderRepository extends MongoRepository<Order, Integer>{

    


}
