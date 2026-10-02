package com.example.practice.solidprinciple;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class CardPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("CARD PAYMENT");
    }
}
