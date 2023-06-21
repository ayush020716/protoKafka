package org.example.kafka.service;

import org.example.service.KafkaPublisherService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
class KafkaPublisherServiceTest {
    @Autowired
    KafkaPublisherService service;
    @Test
    public void sendMessage(){
        service.sendMessage("Hi");
    }
}