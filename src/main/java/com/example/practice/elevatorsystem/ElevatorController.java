package com.example.practice.elevatorsystem;

import java.util.List;

public class ElevatorController {

    private Building building;

      public void processRequst(ElevatorRequest request) {
          if(building.isValidFloor(request.getDestinationFloor())) {
              List<Elevator> elevatorList=building.getElevatorList();
            for(Elevator elevator:elevatorList) {
                  if(elevator.isAvailable()) {
                      elevator.processRequest(request);
                      return;
                  }
            }
            System.out.println("Please wait, all elevator is currently busy");
          } else {
              System.out.println("Request can't be processed as requested destination is invalid floor");
          }
      }

}
