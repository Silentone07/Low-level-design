package com.example.practice.elevatorsystem;

import lombok.Data;

import java.util.List;

@Data
public class Building {

    private List<Floor> floorList;
    private List<Elevator>elevatorList;

     boolean isValidFloor(int floorNo) {
          return getFloor(floorNo)!=null;
     }

    public Floor getFloor(int floorNo) {
        for (Floor floor : floorList) {
            if (floor.getFloorNo() == floorNo) {
                return floor;
            }
        }
        return null;
    }


}
