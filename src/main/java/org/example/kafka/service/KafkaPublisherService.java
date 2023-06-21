package org.example.kafka.service;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;

@Service
public class KafkaPublisherService {
    private final KafkaTemplate<String, String> kafkaTemplate;
    private final NewTopic topicName;

    public KafkaPublisherService(KafkaTemplate<String, String> kafkaTemplate, NewTopic topicName) {
        this.kafkaTemplate = kafkaTemplate;
        this.topicName = topicName;
    }

    public void sendMessage(String message) {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send(topicName.name(), message);
        future.addCallback(result -> {
            assert result != null;
            System.out.println(result.toString());
        }, ex -> {
            System.out.println(ex);
        });
    }
}
