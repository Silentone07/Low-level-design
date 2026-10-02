package com.example.practice.bookmyshow;

import lombok.Data;

import java.util.List;

@Data
public class Theatre {

   private Long theatreId;
   private String theatreName;
    private String address;
   private  List<Screen> screens;
}
