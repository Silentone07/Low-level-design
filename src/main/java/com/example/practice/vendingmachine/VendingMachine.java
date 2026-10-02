package com.example.practice.vendingmachine;

import lombok.Data;

@Data
public class VendingMachine {

   // private IdleState idleState;
   // private HasMoneyState hasMoneyState;
  //  private ProductSelectedState productSelectedState;
    private DispenseState dispenseState;
    private Inventory inventory;
    private Transaction currentTransaction;
    private VendingMachineState currentState;
}

