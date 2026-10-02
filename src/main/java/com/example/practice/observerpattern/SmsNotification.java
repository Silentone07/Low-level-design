package com.example.practice.observerpattern;

public class SmsNotification implements Observer{
    @Override
    public void update(OrderStatus status) {
        System.out.println("Received update notification :" + status);
    }
}
