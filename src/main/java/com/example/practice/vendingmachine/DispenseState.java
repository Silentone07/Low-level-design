package com.example.practice.vendingmachine;

import org.springframework.beans.factory.annotation.Autowired;

public class DispenseState implements VendingMachineState {

    @Autowired
    private VendingMachine vendingMachine;
    @Override
    public void insertCoin(Coin coin) {
    }

    @Override
    public void selectProduct(Product product) {

    }

    @Override
    public void dispenseProduct() {
          vendingMachine.getInventory().setQuantity(vendingMachine.getInventory().getQuantity()-1);
           int change=vendingMachine.getCurrentTransaction().getTotalAmount()-
                   vendingMachine.getInventory().getProduct().getPrice();
               refund(change);
               vendingMachine.setCurrentTransaction(null);
             //  vendingMachine.setCurrentState(vendingMachine.getIdleState());

    }

    @Override
    public int refund(int change) {
        return change;
    }
}
