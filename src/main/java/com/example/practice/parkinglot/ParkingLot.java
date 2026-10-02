package com.example.practice.parkinglot;

import java.util.List;

public class ParkingLot {

    private int id;
    private List<ParkingLevel> parkingLevels;

   // private Ticket ticket;

    public boolean isSpotAvailable(Vehicle vehicle) {

         for(ParkingLevel parkingLevel: parkingLevels) {

              ParkingSpot availableSpot=parkingLevel.findAvailableSpot(vehicle);

              if(availableSpot!=null) {
                  return true;
              }

         }
         return false;
    }

    public  Ticket parkedVehicle(Vehicle vehicle) {

        for(ParkingLevel parkingLevel: parkingLevels) {

            ParkingSpot availableSpot=parkingLevel.findAvailableSpot(vehicle);

            if(availableSpot!=null) {

                availableSpot.parkVehicle(vehicle);

                Ticket ticket=new Ticket();
                ticket.setFarePrice(20);
                ticket.setParkingLevelNo(parkingLevel.getParkingLevelNo());
                ticket.setVehicleType(vehicle.getVehicleType());
                ticket.setSpotId(availableSpot.getId());
                return ticket;
            }

        }
        return null;
    }

    public void unParkVehicle(Ticket ticket) {
        for(ParkingLevel parkingLevel: parkingLevels) {
            if(parkingLevel.getParkingLevelNo()== ticket.getParkingLevelNo()) {
                for(ParkingSpot parkingSpot : parkingLevel.getParkingSpots()) {
                    if(parkingSpot.getId()== ticket.getSpotId()) {
                        parkingSpot.unParkVehicle();

                        System.out.println("Vehicle unparked");
                        return;
                    }
                }
            }
        }
    }


}
