package com.satyam.repo;

import com.satyam.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ICustomerRepo extends MongoRepository<Customer, String> {
}
