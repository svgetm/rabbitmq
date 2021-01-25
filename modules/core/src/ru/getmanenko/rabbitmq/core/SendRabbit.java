package ru.getmanenko.rabbitmq.core;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(SendRabbit.NAME)
public class SendRabbit {
    public static final String NAME = "rabbitmq_SendRabbit";

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void senderToQueue() {

        rabbitTemplate.convertAndSend("queue", "Test message");

    }

}