package com.example.practice.splitwiseapp;

import java.util.List;

public class ExactSplitStrategy implements SplitStrategy{

    @Override
    public List<Split> calculateSplit(Expense expense) {

        Double sum=0.0;
        for(Split split: expense.getSplitList()) {
             sum+= split.getAmount();
        }
        if(sum!= expense.getAmount()) {
              throw  new IllegalArgumentException("expense is not devided correctly");
        }
        return expense.getSplitList();
    }
}
