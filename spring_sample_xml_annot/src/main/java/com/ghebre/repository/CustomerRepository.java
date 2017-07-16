package com.ghebre.repository;

import java.util.List;

import com.ghebre.model.Customer;

/**
 * Created by ghebremg on 7/15/17.
 */
public interface CustomerRepository {

    List<Customer> findAll();
}
