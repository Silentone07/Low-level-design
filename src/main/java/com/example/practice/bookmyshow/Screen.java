package com.example.practice.bookmyshow;

import lombok.Data;

import java.util.List;

@Data
public class Screen {

   private  Long screenId;
    private Theatre theatre;
   private  List<Seat> seats;
   private List<Show> shows;
}
