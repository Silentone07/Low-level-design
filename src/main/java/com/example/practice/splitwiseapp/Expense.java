package com.example.practice.splitwiseapp;

import lombok.Data;

import java.util.List;

@Data
public class Expense {

    private Double amount;
    private User paidBy;
    private List<Split> splitList;
    private List<User>userList;
    private SplitStrategy splitStrategy;

    public Expense(Double amount,User paidBy,List<User>userList,
                   SplitStrategy splitStrategy) {
        this.amount=amount;
        this.paidBy=paidBy;
        this.userList=userList;
        this.splitStrategy=splitStrategy;
    }

     public void calculateSplit() {
          this.splitList=this.splitStrategy.calculateSplit(this);
     }
}
