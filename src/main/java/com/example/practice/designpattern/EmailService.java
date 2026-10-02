package com.example.practice.designpattern;

import com.example.practice.solidprinciple.NotificationService;
import com.sun.nio.sctp.Notification;

public class EmailService implements NotificationService {

    @Override
    public void send() {
        System.out.println("Email notification service");
    }
}
