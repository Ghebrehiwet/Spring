package com.ghebre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.ghebre.model.Customer;
import com.ghebre.repository.CustomerRepository;
import com.ghebre.repository.CustomerRepositoryImpl;

/**
 * Created by ghebremg on 7/15/17.
 */

@Service("customerService")
@Scope("prototype")
public class CustomerServiceImpl implements CustomerService {

//    @Autowired
    private CustomerRepository customerRepository;

    public CustomerServiceImpl(){

    }

    @Override
    public List<Customer> findAll(){
        return customerRepository.findAll();
    }

//    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        System.out.println("This is constructor injection");
        this.customerRepository = customerRepository;
    }

        @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        System.out.println("This is setter autowiring");

        this.customerRepository = customerRepository;
    }
}
