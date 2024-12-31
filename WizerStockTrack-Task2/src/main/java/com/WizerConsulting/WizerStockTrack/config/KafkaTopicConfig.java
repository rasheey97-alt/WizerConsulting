package com.WizerConsulting.WizerStockTrack.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;


@Configuration
public class KafkaTopicConfig {

    @Value  ("${spring.kafka.topic.orderCreation}")
    private String topicName;

    @Value("${spring.kafka.topic-json.orderCreation}")
    private String orderCreation;

    @Bean
    public NewTopic orderCreationTopic(){
        return TopicBuilder.name(orderCreation)
                .build();
    }


}