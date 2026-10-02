package com.example.practice.splitwiseapp;

import java.util.List;

public interface SplitStrategy {

    List<Split> calculateSplit(Expense expense);
}
