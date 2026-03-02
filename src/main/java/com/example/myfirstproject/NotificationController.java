package com.example.myfirstproject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private NotificationService service;

    public NotificationController(

        @Qualifier("emailService")
        NotificationService service){

        this.service = service;

    }

    @GetMapping("/notify")

    public String notifyUser(){

        return service.send();

    }

}