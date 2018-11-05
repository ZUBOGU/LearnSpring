package com.practice.spring.repository;

import com.practice.spring.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("CustomerRepository")
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
