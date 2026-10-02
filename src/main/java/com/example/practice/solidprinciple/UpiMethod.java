package com.example.practice.solidprinciple;

import org.springframework.stereotype.Service;

@Service
public class UpiMethod implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("UPI PAYMENT");
    }
}
