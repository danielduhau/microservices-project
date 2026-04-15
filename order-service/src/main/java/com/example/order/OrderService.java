package com.example.order;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import com.example.order.Order;
import com.example.order.OrderRepository;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;
    private final KafkaTemplate<String, String> kafkaTemplate;

    public Order createOrder() {
        Order order = new Order();
        order.setStatus("CREATED");
        repository.save(order);

        kafkaTemplate.send("order-topic", "ORDER_CREATED:" + order.getId());

        return order;
    }
}