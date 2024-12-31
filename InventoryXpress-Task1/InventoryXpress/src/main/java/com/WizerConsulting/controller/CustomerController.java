package com.WizerConsulting.controller;




import com.WizerConsulting.model.Customer;
import com.WizerConsulting.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    // Endpoint to create a customer
    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    // Endpoint to get a customer by phone number
    @GetMapping("/phone/{phoneNumber}")
    public Optional<Customer> getCustomerByPhone(@PathVariable String phoneNumber) {
        return customerService.findCustomerByPhone(phoneNumber);
    }

    // Endpoint to get all customers
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    // Endpoint to delete a customer by phone number
    @DeleteMapping("/phone/{phoneNumber}")
    public boolean deleteCustomer(@PathVariable String phoneNumber) {
        return customerService.deleteCustomer(phoneNumber);
    }
}
