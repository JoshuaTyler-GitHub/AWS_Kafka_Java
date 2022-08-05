package com.accenture.mskjava.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "TestTopic", groupId = "msk-node")
    public void consume(String message) {
        System.out.println("[TestTopic]: " + message);
    }
}
