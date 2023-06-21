package org.example.test;

import org.example.service.KafkaPublisherService;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class TestsComponent {
    private final KafkaPublisherService service;

    public TestsComponent(KafkaPublisherService service) {
        this.service = service;
    }

    @Scheduled(initialDelay = 1000 * 2, fixedDelay=Long.MAX_VALUE)
    public void test1(){
        System.out.println("Scheduled run [TEST1]");
        service.sendMessage("hello from scheduled test " + System.nanoTime());
    }

}
