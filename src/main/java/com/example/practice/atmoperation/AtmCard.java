package com.example.practice.atmoperation;

import lombok.Data;

@Data
public class AtmCard {

    private String atmHolder;
    private String atmCardNo;
    private int atmPinNo;
    private int cvvNo;
    private BankAccountDtls accountDtls;

    public boolean validatePin( int pin) {
        return this.atmPinNo==pin;
    }
}
