package com.anee.kafka.learnKafka.notification_service.consumer;

import com.anee.kafka.learnKafka.user_service.event.UserCreatedEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserKafkaConsumer {

    @KafkaListener(topics = "user-created-topic")
    public void handleUserCreatedTopic(UserCreatedEvent userCreatedEvent) {
        log.info("handleUserCreatedTopic: {}", userCreatedEvent);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopic1(String message) {
        log.info("Received message from user-random-topic 1: {}", message);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopic2(String message) {
        log.info("Received message from user-random-topic 2: {}", message);
    }

    @KafkaListener(topics = "user-random-topic")
    public void handleUserRandomTopic3(String message) {
        log.info("Received message from user-random-topic 3: {}", message);
    }
}
