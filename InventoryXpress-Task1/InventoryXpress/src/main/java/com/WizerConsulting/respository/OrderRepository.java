package com.WizerConsulting.respository;


import com.WizerConsulting.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface OrderRepository extends JpaRepository<Order, Long> {

    // Save an order - provided by JpaRepository
    // No need to explicitly define this unless you want to add custom behavior

    // Find an order by its ID
    Optional<Order> findById(Long id);

    // You can also add other custom query methods if needed, for example, finding orders by customer name, etc.
}
