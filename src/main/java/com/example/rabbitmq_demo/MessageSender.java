package com.example.rabbitmq_demo;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public void send(String message) {
        rabbitTemplate.convertAndSend("testjj", message);
    }

    public void sendToTopic(String message) {
        rabbitTemplate.convertAndSend("myTopicExchange", "routing.key.test", message);
    }
}