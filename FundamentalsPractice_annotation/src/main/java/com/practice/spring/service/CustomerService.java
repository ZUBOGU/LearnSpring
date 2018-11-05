package com.practice.spring.service;

import com.practice.spring.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
