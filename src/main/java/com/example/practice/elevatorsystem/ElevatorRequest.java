package com.example.practice.elevatorsystem;

import lombok.Data;

@Data
public class ElevatorRequest {

    private int sourceFloor;
    private int destinationFloor;
    private int passengerWeight;

    public ElevatorRequest(int sourceFloor,int destinationFloor,int passengerWeight) {
         this.sourceFloor=sourceFloor;
         this.destinationFloor=destinationFloor;
         this.passengerWeight=passengerWeight;
    }
}
