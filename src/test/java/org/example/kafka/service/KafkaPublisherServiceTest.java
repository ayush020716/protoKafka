package org.example.kafka.service;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.junit.jupiter.api.Assertions.*;

@Component
class KafkaPublisherServiceTest {
    @Autowired
    KafkaPublisherService service;
    @Test
    public void sendMessage(){
        service.sendMessage("Hi");
    }
}