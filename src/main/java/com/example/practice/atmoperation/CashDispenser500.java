package com.example.practice.atmoperation;

import lombok.Data;

@Data
public class CashDispenser500 extends CashDisp {

    CashDispenser500(int numberOfNotes) {
        this.numberOfNotes=numberOfNotes;
        this.denomination=500;
    }
}
