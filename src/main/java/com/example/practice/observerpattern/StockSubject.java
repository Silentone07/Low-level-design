package com.example.practice.observerpattern;

public interface StockSubject {



    void addObserver(StockObserver observer);

    void removeObserver(StockObserver observer);

    public void notifyObserver();
}
