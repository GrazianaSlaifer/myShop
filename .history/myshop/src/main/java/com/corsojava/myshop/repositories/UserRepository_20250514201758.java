package com.corsojava.myshop.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.corsojava.myshop.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, Integer> {

    


}
