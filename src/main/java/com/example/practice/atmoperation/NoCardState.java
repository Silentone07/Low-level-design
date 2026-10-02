package com.example.practice.atmoperation;

public class NoCardState implements AtmState {

    @Override
    public void insertCard(AtmMachine atm, AtmCard atmCard) {
        atm.setCurrentCard(atmCard);
        atm.setCurrentState(new CardInserted());
    }

    @Override
    public void validatePin(AtmMachine atmMachine,int pin) {
        System.out.println("Please enter card first");
    }

    @Override
    public void withdrawCash(AtmMachine atm, int amount) {
        System.out.println("Please enter card first");
    }

    @Override
    public void ejectCard(AtmMachine atm) {
        System.out.println("Please enter card first");
    }
}
