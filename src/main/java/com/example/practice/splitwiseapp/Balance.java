package com.example.practice.splitwiseapp;

import lombok.Data;

@Data
public class Balance {

    private User from;
    private User to;
    private Double amount;

    public Balance(User from, User to, Double amount) {
         this.from=from;
         this.to=to;
         this.amount=amount;
    }
}
