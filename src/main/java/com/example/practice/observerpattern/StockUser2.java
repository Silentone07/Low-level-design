package com.example.practice.observerpattern;

public class StockUser2 implements StockObserver {
    @Override
    public void update(double price) {
         System.out.println("Price got changed for this stock" + price);
    }
}
