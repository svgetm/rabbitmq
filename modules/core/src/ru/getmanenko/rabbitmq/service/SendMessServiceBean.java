package ru.getmanenko.rabbitmq.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.getmanenko.rabbitmq.core.SendRabbit;

import javax.inject.Inject;

@Service(SendMessService.NAME)
public class SendMessServiceBean implements SendMessService {

    @Inject
    private SendRabbit sendRabbit;

    @Override
    public void sendmess() {
        sendRabbit.sender();
    }

    @Override
    public void give() {
        sendRabbit.giveme();
    }
}