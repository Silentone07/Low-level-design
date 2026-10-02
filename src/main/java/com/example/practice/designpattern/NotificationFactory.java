package com.example.practice.designpattern;

import com.example.practice.solidprinciple.NotificationService;
import org.springframework.stereotype.Service;

@Service
public class NotificationFactory {

    public static NotificationService getNotification(String type) {
        if(type.equalsIgnoreCase("Email")) {
            return new EmailService();
        } else if(type.equalsIgnoreCase("pushNotification")) {
              return new PushNotification();
        }
        throw new IllegalArgumentException("notification service type is not valid");
    }
}
