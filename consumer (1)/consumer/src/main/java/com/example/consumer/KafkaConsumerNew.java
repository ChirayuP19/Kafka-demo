package com.example.consumer;


import com.example.consumer.rider.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumerNew{

    @Bean
   public Consumer<RiderLocation> processRiderLocation(){
        return location-> System.out.println("Received: "+location.getRiderID()+": "+location.getLatitude()+", "+location.getLongitude());
    }

    @Bean
    public Consumer<String> processRiderStatus(){
        return status-> System.out.println("Received: "+status);
    }


}
