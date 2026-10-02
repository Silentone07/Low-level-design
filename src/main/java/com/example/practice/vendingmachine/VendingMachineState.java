package com.example.practice.vendingmachine;

import java.util.List;

public interface VendingMachineState {

         void insertCoin(Coin coin);
         void selectProduct(Product product);
          void dispenseProduct();
          int refund(int change);
}
