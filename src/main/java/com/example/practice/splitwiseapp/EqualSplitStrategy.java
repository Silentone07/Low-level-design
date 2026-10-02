package com.example.practice.splitwiseapp;

import java.util.ArrayList;
import java.util.List;

public class EqualSplitStrategy implements SplitStrategy {

    @Override
    public List<Split> calculateSplit(Expense expense) {
        List<Split>splitList=new ArrayList<>();
          double share= expense.getAmount()/expense.getUserList().size();
          for(User user: expense.getUserList()) {
                splitList.add(new Split(user,share));
          }
          return splitList;
    }
}
