package com.example.practice.splitwiseapp;

import lombok.Data;

@Data
public class Split {

    private User user;
    private Double amount;

    public Split(User user, Double amount) {
          this.user=user;
          this.amount=amount;
    }
}
