package com.example.practice.solidprinciple;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    NotificationService notificationService;

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }
    public void sendMessage() {
        notificationService.send();
    }
}
