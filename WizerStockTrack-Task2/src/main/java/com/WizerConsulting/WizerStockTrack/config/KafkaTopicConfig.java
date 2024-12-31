package com.WizerConsulting.WizerStockTrack.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    public NewTopic orderCreationTopic() {
        return TopicBuilder.name("orderCreation")
                .build();
   }
}
