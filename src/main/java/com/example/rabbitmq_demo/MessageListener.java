package com.example.rabbitmq_demo;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class MessageListener {

    @RabbitListener(queues = "testjj")
    public void receive(String message) {
        System.out.println("Received message: " + message);
    }
}