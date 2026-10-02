package com.example.practice.bookmyshow;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Map;

@Data
public class Show {

     private int showId;
     private Movie movie;
    private Screen screen;
    private LocalDateTime startTime;
   private LocalDateTime endTime;
   private Map<Integer,SeatStatus> seatStatus;
}
