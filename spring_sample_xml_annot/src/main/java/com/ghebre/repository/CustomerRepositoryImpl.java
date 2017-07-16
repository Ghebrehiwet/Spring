package com.ghebre.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.ghebre.model.Customer;

/**
 * Created by ghebremg on 7/15/17.
 */
@Repository("customerRepository")
public class CustomerRepositoryImpl implements CustomerRepository {

    @Value("${dbUserName}")
    private String dbUserName;

    @Override
    public List<Customer> findAll(){

        System.out.println(dbUserName);
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Ghebre");
        customer.setLastname("Ghebremedhin");

        customers.add(customer);

        return customers;

    }

}
