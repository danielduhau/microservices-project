package com.example.order;

import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import com.example.order.OrderService;
import com.example.order.Order;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping
    public Order createOrder() {
        return service.createOrder();
    }
}