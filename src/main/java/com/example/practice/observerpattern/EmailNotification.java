package com.example.practice.observerpattern;

public class EmailNotification implements Observer {
    @Override
    public void update(OrderStatus status) {
        System.out.println("Notification service received updated status" + status);
    }
}
