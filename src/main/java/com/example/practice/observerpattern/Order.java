package com.example.practice.observerpattern;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class Order implements Subject {

     List<Observer> observerList;
     private OrderStatus status;
    @Override
    public void notifyObserver() {
       for(Observer observer : observerList) {
             observer.update(status);
       }
    }

    @Override
    public void addObserver(Observer observer) {
         observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
          observerList.remove(observer);
    }
    public void updateStatus(OrderStatus status) {
        this.status=status;
        notifyObserver();
    }
}
