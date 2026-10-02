package com.example.practice.solidprinciple;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmailNotification implements NotificationService {

    @Override
    public void send() {
        System.out.println("Email Notification");
    }
}
