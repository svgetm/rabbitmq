package ru.getmanenko.rabbitmq.web.screens;

import com.haulmont.cuba.gui.screen.Screen;
import com.haulmont.cuba.gui.screen.UiController;
import com.haulmont.cuba.gui.screen.UiDescriptor;
import ru.getmanenko.rabbitmq.service.SendMessService;

import javax.inject.Inject;

@UiController("screen")
@UiDescriptor("new-screen.xml")
public class NewScreen extends Screen {
    @Inject
    private SendMessService sendMessService;

    public void go() {

        sendMessService.sendmess();
    }

    public void goback() {
        sendMessService.give();
    }
}