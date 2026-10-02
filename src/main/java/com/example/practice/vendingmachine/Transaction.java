package com.example.practice.vendingmachine;

import lombok.Data;

import java.util.List;

@Data
public class Transaction {

   private int transactionId;
   private Product selectedProduct;
   private List<Coin> insertedCoins;
   private int totalAmount;

   public void addCoin(Coin coin) {
         insertedCoins.add(coin);
         totalAmount+=coin.getValue();
   }
}
