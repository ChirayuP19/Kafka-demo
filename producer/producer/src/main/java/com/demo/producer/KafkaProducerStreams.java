package com.demo.producer;

import com.demo.producer.rider.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.util.MimeTypeUtils;


import java.util.Random;
import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {

    @Bean
    public Supplier<RiderLocation> sendRiderLocation(){
        Random random = new Random();
        return ()->{
            String riderID= "rider" +random.nextInt(20);
            RiderLocation location = new RiderLocation(riderID, 16.7, 98.45);
            System.out.println("Sending: "+location.getRiderID());
            return location;
        };
    }

    @Bean
    public Supplier<Message<String>> sendRiderStatus(){
        Random random = new Random();
        return ()->{
            String riderID= "rider" +random.nextInt(20);
            String status = random.nextBoolean() ? "rider started" : "ride completed";
            System.out.println("Sending: "+status);
            return MessageBuilder.withPayload(riderID+" :status "+status)
                    .setHeader(KafkaHeaders.KEY,riderID.getBytes())
                    .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.TEXT_PLAIN)
                    .build();
        };
    }
}
