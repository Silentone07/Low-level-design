package com.example.practice.decorator;

public abstract class CoffeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeDecorator(Coffee coffee) {
         this.coffee=coffee;
    }
}
