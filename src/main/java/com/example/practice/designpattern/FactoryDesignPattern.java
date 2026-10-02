package com.example.practice.designpattern;

import org.springframework.stereotype.Service;

@Service
public class FactoryDesignPattern {

    public static Vehicle getVehicle(String type) {
         if(type.equalsIgnoreCase("car")) {
              return new Car();
         } else if(type.equalsIgnoreCase("bike")) {
              return new Bike();
         }
         throw new IllegalArgumentException("vehicle type is not valid");
    }
}
