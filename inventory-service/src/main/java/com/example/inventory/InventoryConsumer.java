package com.example.inventory;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class InventoryConsumer {

    @KafkaListener(topics = "payment-topic", groupId = "inventory-group")
    public void updateStock(String message) {
        System.out.println("Atualizando estoque: " + message);
    }
}