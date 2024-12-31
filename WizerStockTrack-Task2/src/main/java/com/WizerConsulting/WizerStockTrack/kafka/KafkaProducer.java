package com.WizerConsulting.WizerStockTrack.kafka;

import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    private KafkaTemplate<String,String>kafkaTemplate;
    public KafkaProducer(KafkaTemplate<String, String> KafkaTemplate){
        this.kafkaTemplate =KafkaTemplate;
    }
    public void sendMessag(String message){
        LOGGER.info(String.format("Message sent %s", message));
        kafkaTemplate.send("orderCreation",message );
    }
}


