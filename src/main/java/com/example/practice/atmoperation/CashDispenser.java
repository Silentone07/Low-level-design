package com.example.practice.atmoperation;

public class CashDispenser {

    private int availableCash;
    private int denomination;

    public boolean hasSufficientAmount(int amount) {

        return availableCash>=amount;
    }

    public void dispenseCash(int amount) {

         if(amount<denomination) {

         }
    }

}
