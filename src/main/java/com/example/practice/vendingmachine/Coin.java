package com.example.practice.vendingmachine;

import lombok.Data;


public enum Coin {
    ONE(1),
    TWO(2),
    FIVE(5);

    private final int value;

     Coin(int value) {
          this.value=value;
     }
     public int getValue() {
         return value;
     }
}
