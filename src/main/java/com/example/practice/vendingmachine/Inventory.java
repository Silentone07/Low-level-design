package com.example.practice.vendingmachine;

import lombok.Data;

@Data
public class Inventory {

    private Product product;
    private int quantity;
}
