package com.example.notification;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationConsumer {

    @KafkaListener(topics = "payment-topic", groupId = "notification-group")
    public void handleNotification(String message) {
        System.out.println("Enviando notificação: " + message);
    }
}