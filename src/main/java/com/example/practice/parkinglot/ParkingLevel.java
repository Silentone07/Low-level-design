package com.example.practice.parkinglot;

import lombok.Data;

import java.util.List;

@Data
public class ParkingLevel {

    private int parkingLevelNo;
    private List<ParkingSpot> parkingSpots;

    public ParkingSpot findAvailableSpot(Vehicle vehicle) {

        for(ParkingSpot spot:parkingSpots) {
             if(!spot.isOccupied() && spot.getParkingSpotVehicleType()==vehicle.getVehicleType()) {
                 return spot;
             }
        }
        return null;
    }

}
