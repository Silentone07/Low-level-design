package com.example.practice.atmoperation;

public class BankAccountDtls {

    private int accountNo;
    private int branchCode;
    private int balance;

    public boolean hasSufficientBalance(int amount) {
        return balance>=amount;
    }

    public void debitAmount(int amount) {
        balance-=amount;
    }
}
