package com.WizerConsulting.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.WizerConsulting.model.Order;
import com.WizerConsulting.model.Product;
import com.WizerConsulting.respository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.WizerConsulting.model.Order;
import com.WizerConsulting.model.Product;
import com.WizerConsulting.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductService productService;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    // Place an order and send details to Kafka
    public Order placeOrder(Order order) {
        // Check if the product is available
        Product product = productService.getProductById(order.getProductId());

        if (productService.isProductAvailable(order.getProductId(), order.getQuantity())) {
            product.setStock(product.getStock() - order.getQuantity()); // Reduce stock
            // Optionally save the updated product back to DB
            // productRepository.save(product);

            // Save the order
            Order savedOrder = orderRepository.save(order);

            // Prepare the order details message
            String orderDetails = String.format("Order ID: %d, Customer: %s, Product: %s, Quantity: %d",
                    savedOrder.getOrderId(), order.getCustomerName(), product.getName(), order.getQuantity());

            // Send order details to Kafka
            kafkaProducerService.sendOrderDetails(orderDetails);

            return savedOrder;
        } else {
            throw new RuntimeException("Insufficient stock for this order");
        }
    }
}


