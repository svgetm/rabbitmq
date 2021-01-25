package ru.getmanenko.rabbitmq.core;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(SendRabbit.NAME)
public class SendRabbit {
    public static final String NAME = "rabbitmq_SendRabbit";

    @Autowired
    RabbitTemplate rabbitTemplate;

    public void sender() {

        rabbitTemplate.convertAndSend("queue1", "Да сука");

    }


    public void giveme() {
        System.out.println(rabbitTemplate.receive("queue1"));
    }
}