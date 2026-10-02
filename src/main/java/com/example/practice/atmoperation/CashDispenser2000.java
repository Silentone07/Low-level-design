package com.example.practice.atmoperation;

import lombok.Data;

@Data
public  class CashDispenser2000 extends CashDisp {


      public  CashDispenser2000(int numberOfNotes) {
            this.numberOfNotes=numberOfNotes;
            this.denomination=2000;
      }
}
