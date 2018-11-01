package com.practice.spring.repository;

import com.practice.spring.model.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
