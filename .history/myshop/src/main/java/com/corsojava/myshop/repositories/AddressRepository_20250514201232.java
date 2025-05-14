package com.corsojava.myshop.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.corsojava.myshop.models.Address;

@Repository
public interface AddressRepository extends
        MongoRepository<Address, String> {

    List<Address> findByCategory(String i);
}
