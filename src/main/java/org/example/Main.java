package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        SpringApplication.run(Main.class, args);
    }

    @KafkaListener(topics = "protoKafka", groupId = "1")
    public void listenGroup1(String message) {
        System.out.println("Received message in group 1 = " + message);
    }

}