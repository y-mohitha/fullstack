package com.example.myfirstproject;

import org.springframework.stereotype.Service;

@Service("emailService")
public class EmailNotificationService implements NotificationService {

    @Override
    public String send(){

        return "Email Notification Sent";

    }

}