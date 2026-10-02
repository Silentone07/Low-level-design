package com.example.practice.splitwiseapp;

import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
public class Group {
     private int groupId;
     private String groupName;
     private List<User>userList;
     private List<Expense> expenseList;

     public Group(int groupId,String groupName,List<User>userList,List<Expense>expenseList) {
             this.groupId=groupId;
             this.groupName=groupName;
             this.userList=userList;
             this.expenseList=expenseList;
     }



      public void addExpense(Expense expense) {
          expenseList.add(expense);
      }

      public List<Balance> getBalance() {
           List<Balance>userBalance=new ArrayList<>();
            for(Expense expense : expenseList) {
                  for(Split split : expense.getSplitList()) {
                       if(!expense.getPaidBy().equals(split.getUser())) {
                         //  String userBalanceMessage= split.getUser().getUserName() + "ows" + expense.getPaidBy();
                            userBalance.add(new Balance(split.getUser(),expense.getPaidBy(),split.getAmount()));
                       }
                  }
            }
            return userBalance;
      }


}
