package com.example.myfirstproject;

import org.springframework.stereotype.Service;

@Service("smsService")
public class SMSNotificationService implements NotificationService {

    @Override
    public String send(){

        return "SMS Notification Sent";

    }

}