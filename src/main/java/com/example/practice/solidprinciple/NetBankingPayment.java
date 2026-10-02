package com.example.practice.solidprinciple;

import org.springframework.stereotype.Service;

@Service
public class NetBankingPayment implements PaymentMethod {

    @Override
    public void pay() {
        System.out.println("NETBANKING PAYMENT");
    }
}
