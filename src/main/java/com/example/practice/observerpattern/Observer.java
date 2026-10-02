package com.example.practice.observerpattern;

public interface Observer {

    public void update(OrderStatus status);
}

//When X happens, multiple independent components need to react.
