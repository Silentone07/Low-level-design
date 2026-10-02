package com.example.practice.notificationservice;

public class PushNotification implements Notification {
    @Override
    public void sendMessage(String recipient,String message) {
        System.out.println("Sending Push notification" + message + "To :"  + recipient);
    }
}
