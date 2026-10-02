package com.example.practice.vendingmachine;

import ch.qos.logback.core.net.SyslogOutputStream;

public class ProductSelectedState implements VendingMachineState {

    private VendingMachine vendingMachine;
    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Kindly proceed with product selection");
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Kindly proceed with product selection");
    }

    @Override
    public void dispenseProduct() {
       vendingMachine.getInventory().setQuantity(vendingMachine.getInventory().getQuantity()-1);
       vendingMachine.setCurrentState(vendingMachine.getDispenseState());
    }

    @Override
    public void refund() {

    }
}
