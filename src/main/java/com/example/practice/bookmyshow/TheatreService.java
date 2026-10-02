package com.example.practice.bookmyshow;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TheatreService {

    @Autowired
   private TheatreRepository theatreRepository;
    @Autowired
    private ShowRepository showRepository;

//     List<Show> getAllShow=showRepository.getAllShow(1);
//     List<Seat>getavailableSeat(long showId);

}
