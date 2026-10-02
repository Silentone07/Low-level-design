package com.example.practice.parkinglot;


import lombok.Data;

@Data
public class Ticket {

    private int farePrice;
    private int parkingLevelNo;
    private VehicleType vehicleType;
    private int spotId;
}
