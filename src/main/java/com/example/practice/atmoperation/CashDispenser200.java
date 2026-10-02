package com.example.practice.atmoperation;

import lombok.Data;

@Data
public class CashDispenser200 extends CashDisp {

    public CashDispenser200(int numberOfnotes) {
        this.numberOfNotes=numberOfnotes;
        this.denomination=200;
    }
}
