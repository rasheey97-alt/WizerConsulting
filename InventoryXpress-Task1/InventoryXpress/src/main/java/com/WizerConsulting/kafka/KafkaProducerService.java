package com.WizerConsulting.kafka;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private static final String TOPIC = "orderCreation"; // CreationKafka Topic Name

    @Autowired
    private kafkatemplate<String, String> kafkaTemplate;

    // Send order details to Kafka
    public void sendOrderDetails(String orderDetails) {
        kafkaTemplate.send(TOPIC, orderDetails);
    }
}
