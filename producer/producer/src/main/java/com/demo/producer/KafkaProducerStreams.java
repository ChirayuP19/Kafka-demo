package com.demo.producer;

import com.demo.producer.rider.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        return ()->{
            RiderLocation location = new RiderLocation("Rider123", 16.7, 98.45);
            System.out.println("Sending: "+location.getRiderID());
            return location;
        };
    }
}
