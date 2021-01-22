package com.example.uberorderservice.controller;

import com.example.uberorderservice.entity.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class OrderController {

    @GetMapping("order")
    public Order getOrder() throws InterruptedException {
        Thread.sleep(2000);
        return new Order(1L,"阿尔山");
    }
}
