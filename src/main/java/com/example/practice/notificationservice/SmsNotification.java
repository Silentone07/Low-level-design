package com.example.practice.notificationservice;

public class SmsNotification implements Notification {
    @Override
    public void sendMessage(String recipient,String message) {
        System.out.println("sms notification service");
    }
}
