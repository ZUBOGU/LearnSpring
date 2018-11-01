package com.practice.spring.service;

import com.practice.spring.model.Customer;
import com.practice.spring.repository.CustomerRepository;
import com.practice.spring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
