package com.example.practice.atmoperation;

public interface AtmState {



    public void insertCard(AtmMachine atm,AtmCard atmCard);
           void validatePin(AtmMachine atm,int pin);
           void withdrawCash(AtmMachine atm,int amount);
           void ejectCard(AtmMachine atm);

}
