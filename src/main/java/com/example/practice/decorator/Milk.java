package com.example.practice.decorator;

public class Milk extends CoffeDecorator {

        public Milk(Coffee coffee) {
            super(coffee);
       }
    @Override
    public double getCost() {
        return coffee.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + "," + "Milk";
    }
}
