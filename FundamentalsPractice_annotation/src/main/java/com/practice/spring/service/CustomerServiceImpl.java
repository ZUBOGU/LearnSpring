package com.practice.spring.service;

import com.practice.spring.model.Customer;
import com.practice.spring.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    //This is field level injection
//    @Autowired
    private CustomerRepository customerRepository;

    //This is constructor injection
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("We are using constructor injection");

        this.customerRepository = customerRepository;
    }

    //This is setter injection.
//    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("We are using setter injection");
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
