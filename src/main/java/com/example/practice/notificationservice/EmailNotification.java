package com.example.practice.notificationservice;

public class EmailNotification implements Notification {
    @Override
    public void sendMessage(String recipient,String message) {
        System.out.println("Email notification service");
    }
}
