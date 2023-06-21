package org.example;

import org.example.kafka.service.KafkaPublisherService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Main {

    private final KafkaPublisherService service;
    public Main(KafkaPublisherService service) {
        this.service = service;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(Main.class, args);
    }

    @KafkaListener(topics = "protoKafka", groupId = "1")
    public void listenGroup1(String message) {
        System.out.println("Recieved message in group 1 = " + message);
    }

}