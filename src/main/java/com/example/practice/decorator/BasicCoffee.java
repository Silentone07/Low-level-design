package com.example.practice.decorator;

public class BasicCoffee implements Coffee {
    @Override
    public double getCost() {
        return 100.0;
    }
}
