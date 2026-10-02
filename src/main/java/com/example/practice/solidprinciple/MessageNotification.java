package com.example.practice.solidprinciple;

import org.springframework.stereotype.Service;

@Service
public class MessageNotification implements NotificationService {

    @Override
    public void send() {
        System.out.println("Phone message notification");
    }
}
