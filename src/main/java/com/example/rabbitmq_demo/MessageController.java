package com.example.rabbitmq_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private MessageSender messageSender;

    @GetMapping("/send")
    public String sendMessage(@RequestParam String message) {
        messageSender.send(message);
        return "Message sent: " + message;
    }
}