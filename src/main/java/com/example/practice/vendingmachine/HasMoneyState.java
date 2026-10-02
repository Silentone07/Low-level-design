package com.example.practice.vendingmachine;

public class HasMoneyState implements VendingMachineState {

    private VendingMachine vendingMachine;
    @Override
    public void insertCoin(Coin coin) {
      vendingMachine.getCurrentTransaction().addCoin(coin);
    }

    @Override
    public void selectProduct(Product product) {
         if(vendingMachine.getCurrentTransaction().getTotalAmount()>= product.getPrice()) {
                if(vendingMachine.getInventory().getQuantity()>0) {
                   vendingMachine.getCurrentTransaction().setSelectedProduct(product);
                    vendingMachine.setCurrentState(vendingMachine.getDispenseState());
                }    else {
                     return;
                }
         } else {
             return;
         }
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Kindly proceed with product selection");
    }

//    @Override
//    public void refund() {
//        if(vendingMachine.getCurrentTransaction().getTotalAmount()>0) {
//            System.out.println("get refundable amount" + vendingMachine.getCurrentTransaction().getTotalAmount());
//        } else {
//          System.out.println("Not sufficient amount for refund"); }
    }

}
