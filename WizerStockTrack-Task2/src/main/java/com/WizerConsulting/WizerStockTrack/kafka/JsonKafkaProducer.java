package com.WizerConsulting.WizerStockTrack.kafka;

//import net.WizerConsulting.springboot.payload.Order;  // Assuming 'Order' is the class representing the order payload
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaProducer {

    // Inject the Kafka topic name from the configuration
    @Value("${spring.kafka.topic-json.orderCreation}")
    private String topicJsonName;  // Will be injected with 'ordercreation'

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaProducer.class);

    private KafkaTemplate<String, Order> kafkaTemplate;  // KafkaTemplate for sending Order messages

    // Constructor to initialize KafkaTemplate
    public JsonKafkaProducer(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // Method to send the message to Kafka
    public void sendMessage(Order order) {

        // Log the order message being sent to Kafka
        LOGGER.info(String.format("Message sent -> %s", order.toString()));

        // Create a Kafka message with the order data and topic header
        Message<Order> message = MessageBuilder
                .withPayload(order)  // The order data is the payload
                .setHeader(KafkaHeaders.TOPIC, topicJsonName)  // Set the topic name to 'ordercreation'
                .build();

        // Send the message to Kafka
        kafkaTemplate.send(message);
    }
}
