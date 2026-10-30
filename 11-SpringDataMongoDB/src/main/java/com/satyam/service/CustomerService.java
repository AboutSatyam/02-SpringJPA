package com.satyam.service;

import com.satyam.dto.CustomerDTO;
import com.satyam.model.Customer;
import com.satyam.repo.ICustomerRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepo repo;

    @Override
    public String registerCustomer(CustomerDTO dto) {
        Customer cx = new Customer();
        BeanUtils.copyProperties(dto, cx);

        Customer cxDoc = repo.save(cx);
        return "Customer Info Stored With Id " + cx.getId();
    }

    @Override
    public List<Customer> findAllCustomer() {
        return repo.findAll();
    }

    @Override
    public String removeDocument(String id) {
        Optional<Customer> optional = repo.findById(id);


        if (optional.isPresent()) {
            repo.deleteById(id);
            return "Customer Document Is Deleted Id Was " + id;
        }
        return "NO Document Found ";
    }
}
