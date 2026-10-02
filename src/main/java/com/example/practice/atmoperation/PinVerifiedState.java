package com.example.practice.atmoperation;

public class PinVerifiedState implements AtmState {

    @Override
    public void insertCard(AtmMachine atm, AtmCard atmCard) {
      System.out.println("Kindly proceed for withrawal");
    }

    @Override
    public void validatePin(AtmMachine atm, int pin) {
     System.out.println("Kindly proceed for withrawal");
    }

    @Override
    public void withdrawCash(AtmMachine atm, int amount) {
      if(atm.getCurrentCard().getAccountDtls().hasSufficientBalance(amount)) {
          atm.getCashDisp().process(amount);
          atm.getCurrentCard().getAccountDtls().debitAmount(amount);

         // Transaction transaction=atm.
          System.out.println("Transaction completed successfully");


          atm.setCurrentCard(null);
          atm.setCurrentState(new NoCardState());
      } else {
          System.out.println("Insufficient available amount");
      }
    }

    @Override
    public void ejectCard(AtmMachine atm) {
        atm.setCurrentCard(null);
        atm.setCurrentState(new NoCardState());
    }
}
