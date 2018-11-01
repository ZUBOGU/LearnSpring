package com.practice.spring.repository;

import com.practice.spring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Zubo");
        customer.setLastname("Gu");

        customers.add(customer);

        return customers;
    }
}
