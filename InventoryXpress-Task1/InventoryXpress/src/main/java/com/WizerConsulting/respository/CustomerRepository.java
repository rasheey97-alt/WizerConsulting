package com.WizerConsulting.respository;

import com.WizerConsulting.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, String> {

    // Find a customer by phone number
    Optional<Customer> findByPhoneNumber(String phoneNumber);

    // Optionally, you can add more custom queries if needed
    // Example: Find customer by name
    // List<Customer> findByName(String name);
}
