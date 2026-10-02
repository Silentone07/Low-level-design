package com.example.practice.splitwiseapp;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SplitwiseService {


    public void addExpense(Group group,Expense expense) {
             expense.calculateSplit();
             group.addExpense(expense);
        }

        public List<Balance> showBalance(Group group) {
             return group.getBalance();
        }
}
