package com.example.practice.elevatorsystem;

import lombok.Data;

@Data
public class Elevator {

    private int elvatorId;
    private int currentFloor;
    private int maxWeight;
    private int currentWeight;

    private Direction direction;
   private ElevatorRequest elevatorRequest;

    boolean hasCapacity(int passengerWeight) {
         return currentWeight+passengerWeight<=maxWeight;
    }

    boolean isAvailable() {
          return elevatorRequest==null;
    }

    public void processRequest(ElevatorRequest request) {
      //  currentWeight+=elevatorRequest.getPassengerWeight();
        this.elevatorRequest=request;
        if(hasCapacity(request.getPassengerWeight())) {
           updateDirection(currentFloor, request.getSourceFloor());
           moveToFloor(request.getSourceFloor());
            currentWeight+= request.getPassengerWeight();
            updateDirection(request.getSourceFloor(),request.getDestinationFloor());
           moveToFloor(request.getDestinationFloor());
         currentWeight-= request.getPassengerWeight();
         this.direction=Direction.IDLE;
         this.elevatorRequest=null;

        } else {
            System.out.println("Not able to process request,maxWeight exceeded");
        }
    }

    public void updateDirection(int sourceFloor,int destinationFloor) {
         if(sourceFloor<destinationFloor) {
              this.direction=Direction.UP;
         } else {
              this.direction=Direction.DOWN;
         }
    }

      public void moveToFloor(int floorNo) {
          this.currentFloor=floorNo;
      }

}
