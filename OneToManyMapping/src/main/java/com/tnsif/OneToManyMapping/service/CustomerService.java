package com.tnsif.OneToManyMapping.service;

import java.util.List;

import com.tnsif.OneToManyMapping.entity.Customer;
import com.tnsif.OneToManyMapping.exception.CustomerNotFoundException;

public interface CustomerService {

    // Save a new customer
    Customer saveCustomer(Customer customer);

    // Get all customers
    List<Customer> getAllCustomers();

    // Get customer by ID
    Customer getCustomerById(Long id) throws CustomerNotFoundException; // Declare the exception

    // Update customer by ID
    Customer updateCustomer(Long id, Customer updatedCustomer) throws CustomerNotFoundException; // Declare the exception

    // Delete customer by ID
    boolean deleteCustomer(Long id) throws CustomerNotFoundException; // Declare the exception
}
