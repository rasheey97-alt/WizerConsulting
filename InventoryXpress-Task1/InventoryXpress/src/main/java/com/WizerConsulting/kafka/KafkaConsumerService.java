package com.WizerConsulting.kafka;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    // Listen for messages on the "order_topic" and process them
    @KafkaListener(topics = "orderCreation", groupId = "order-consumer-group")
    public void listenToOrderTopic(String message) {
        // Log or process the incoming message
        System.out.println("Received Order Details: " + message);
    }
}

