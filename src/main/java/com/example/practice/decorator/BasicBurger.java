package com.example.practice.decorator;

public class BasicBurger implements Burger{
    @Override
    public double getPrice() {
        return 100.0;
    }

    @Override
    public String getDescription() {
        return "Basic Burger";
    }
}
