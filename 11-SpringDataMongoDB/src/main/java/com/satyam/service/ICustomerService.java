package com.satyam.service;

import com.satyam.dto.CustomerDTO;
import com.satyam.model.Customer;

import java.util.List;

public interface ICustomerService {
    public String registerCustomer(CustomerDTO dto);

    public List<Customer> findAllCustomer();

    public String removeDocument(String id);
}
