package ru.getmanenko.rabbitmq.service;

public interface SendMessService {
    String NAME = "rabbitmq_SendMessService";


    void sendmess();
    void give();
}