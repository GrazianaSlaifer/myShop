package com.corsojava.myshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corsojava.myshop.models.Payment;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, {

    


}
