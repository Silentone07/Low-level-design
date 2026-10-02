package com.example.practice.observerpattern;

import java.util.List;

public class Stock implements StockSubject {

    private List<StockObserver> stockObserverList;
    private double price;


    @Override
    public void addObserver(StockObserver observer) {
         stockObserverList.add(observer);
    }

    @Override
    public void removeObserver(StockObserver observer) {
        stockObserverList.remove(observer);
    }


    @Override
    public void notifyObserver() {
        for(StockObserver observer:stockObserverList) {
              observer.update(price);
        }
    }

    public void updatePrice(Double price) {
          this.price=price;
          notifyObserver();
    }
}
