package com.example.practice.observerpattern;

public class StockUser1 implements StockObserver {

    @Override
    public void update(double price) {
        System.out.println("Price got changed for this stock" + price);
    }
}
