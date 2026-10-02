package com.example.practice.bookmyshow;

import lombok.Data;

import java.util.List;

@Data
public class Booking {

    private Long bookingId;
    private User user;
    private Show show;
    private List<Integer> seats;
    private BookingStatus status;
}
