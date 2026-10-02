package com.example.practice.decorator;

public class Cheese extends BurgerDecorator {

     public Cheese(Burger burger) {
          super(burger);
     }
    @Override
    public double getPrice() {
        return  burger.getPrice()+30;
    }

    @Override
    public String getDescription() {
        return burger.getDescription() +",Cheese";
    }
}
