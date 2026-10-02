package com.example.practice.atmoperation;

import lombok.Data;

@Data
public abstract class CashDisp {

     protected  int numberOfNotes;
    protected int denomination;
    protected CashDisp nextDispenser;
    public  void process(int amount) {

        if (amount < denomination) {
            nextDispenser.process(amount);
        }
        int requiredNotes = Math.min(numberOfNotes, amount / denomination);
        numberOfNotes -= requiredNotes;

        int remainingAmount = amount - (denomination * requiredNotes);

        if (amount > 0) {
            if (nextDispenser != null) {
                nextDispenser.process(remainingAmount);
            } else {
                System.out.println("Cannot process this denomination,it is null");
            }

        }
    }

}
