package com.example.practice.designpattern;

import com.example.practice.solidprinciple.NotificationService;

public class PushNotification implements NotificationService {

    @Override
    public void send() {
        System.out.println("Push-notification service");
    }
}
