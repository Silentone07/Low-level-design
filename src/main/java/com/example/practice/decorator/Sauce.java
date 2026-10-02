package com.example.practice.decorator;

public class Sauce extends BurgerDecorator {

     public Sauce(Burger burger) {
          super(burger);
     }

    @Override
    public double getPrice() {
        return burger.getPrice() + 20;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() + ", sauce";
    }
}
