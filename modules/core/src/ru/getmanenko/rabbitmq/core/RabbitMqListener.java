package ru.getmanenko.rabbitmq.core;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@EnableRabbit
@Component(RabbitMqListener.NAME)
public class RabbitMqListener {
    public static final String NAME = "rabbitmq_RabbitMqListener";

    @RabbitListener(queues = "queue")
    public void processQueue1(String message) {
        System.out.println(message);
    }
}