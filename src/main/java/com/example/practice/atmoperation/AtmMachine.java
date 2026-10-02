package com.example.practice.atmoperation;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
public class AtmMachine {

    AtmMachine() {
        CashDispenser2000 cashDispenser2000=new CashDispenser2000(10);
        CashDispenser500 cashDispenser500=new CashDispenser500(20);
        CashDispenser200 cashDispenser200=new CashDispenser200(50);

        cashDispenser2000.setNextDispenser(cashDispenser500);
        cashDispenser500.setNextDispenser(cashDispenser200);
        this.cashDisp=cashDispenser2000;

        currentState=new NoCardState();


    }
   private AtmState currentState;

    @Autowired
    public void setCurrentState(AtmState currentState) {
         this.currentState=currentState;
    }
    private int atmId;
    private CashDispenser cashDispenser;
    private AtmCard currentCard;

    private CashDisp cashDisp;

    private CardInserted cardInserted;

    public void insertCard(AtmCard card) {
       this.currentCard=card;
    }

    public boolean validatePin(int pin) {
       return currentCard.validatePin(pin);
    }

    public void withdrawCash(int amount) {
        BankAccountDtls accountDtls=currentCard.getAccountDtls();
        if(!accountDtls.hasSufficientBalance(amount)) {
             System.out.println("Insufficient amount for withrawal");
             return;
        }
        cashDisp.process(amount);
        accountDtls.debitAmount(amount);
    }
    public void ejectCard() {
      currentCard=null;
    }

}
