package com.example.practice.atmoperation;

public class CardInserted  implements  AtmState {

    @Override
    public void insertCard(AtmMachine atm, AtmCard atmCard) {
     System.out.println("Please enter Pin");
    }

    @Override
    public void validatePin(AtmMachine atm,int pin) {

        if (atm.getCurrentCard().validatePin(pin)) {
            atm.setCurrentState(new PinVerifiedState());
            System.out.println("Pin verified successfully");
        } else {
            System.out.println("Please enter correct pin");
        }
    }

    @Override
    public void ejectCard(AtmMachine atm) {
      atm.setCurrentCard(null);
      atm.setCurrentState(new NoCardState());
      System.out.println("Card ijected successfully");
    }

    @Override
    public void withdrawCash(AtmMachine atm, int amount) {
        System.out.println("Please enter valid Pin");
    }
}
