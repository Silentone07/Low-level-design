package com.example.practice.decorator;

public class Sugar extends CoffeDecorator {

    public Sugar(Coffee coffee) {
         super(coffee);
    }
    @Override
    public double getCost() {
        return coffee.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Sugar";
    }
}
