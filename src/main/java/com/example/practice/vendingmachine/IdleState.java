package com.example.practice.vendingmachine;

public class IdleState implements VendingMachineState {

    private VendingMachine vendingMachine;
    @Override
    public void insertCoin(Coin coin) {
       vendingMachine.getCurrentTransaction().addCoin(coin);
        vendingMachine.setHasMoneyState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void selectProduct(Product product) {
      System.out.println("Please insert coins");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert coins");
    }

    @Override
    public void refund() {
        System.out.println("Please insert coins");
    }
}
