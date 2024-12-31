package com.WizerConsulting.respository;



import com.WizerConsulting.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    // Find a product by name
    Product findByName(String name);

    // Optional: Find a product by its ID (returns Optional for better null safety)
    Optional<Product> findById(Long id);

    // You don't need to explicitly define save, findAll, or deleteById methods
    // They are already provided by JpaRepository

    // Additional useful methods can be defined here if necessary
}

