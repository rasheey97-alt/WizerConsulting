package com.WizerConsulting.services;

import com.WizerConsulting.model.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    // List to simulate a database
    private List<Customer> customerList = new ArrayList<>();

    // Save or update customer
    public Customer saveCustomer(Customer customer) {
        // If the customer doesn't exist, simply add them to the list
        customerList.add(customer);
        return customer;
    }

    // Find a customer by phone number
    public Optional<Customer> findCustomerByPhone(String phoneNumber) {
        return customerList.stream()
                .filter(customer -> customer.getPhoneNumber().equals(phoneNumber))
                .findFirst();
    }

    // Find all customers
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    // Delete a customer by phone number
    public boolean deleteCustomer(String phoneNumber) {
        return customerList.removeIf(customer -> customer.getPhoneNumber().equals(phoneNumber));
    }
}

