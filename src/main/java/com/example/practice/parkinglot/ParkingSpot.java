package com.example.practice.parkinglot;

import jdk.jfr.DataAmount;
import lombok.Data;


@Data
public class ParkingSpot {

    private int id;
    private boolean isOccupied;
    private Vehicle parkedVehicle;
    private VehicleType parkingSpotVehicleType;

    public boolean checkOccupied() {
         return isOccupied;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.parkedVehicle=parkedVehicle;
        this.isOccupied=true;
    }

    public void unParkVehicle() {
        this.isOccupied=false;
        this.parkedVehicle=null;
    }
}
