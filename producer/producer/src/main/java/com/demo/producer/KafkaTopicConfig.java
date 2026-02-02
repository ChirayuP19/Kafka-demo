package com.demo.producer;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic myNewTopic(){
        return new NewTopic("my-new-topics-2",3,(short) 1);
    }
}
