package com.example.practice.bookmyshow;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {
  private ShowRepository showRepository;
  private BookingRepository bookingRepository;
  private UserRepository userRepository;

  @Transactional
  public Booking createBooking(int userId, long showId, List<Seat> seatId) {

        User user=userRepository.findById(userId).orElseThrow(()->  new RuntimeException("user not found"));

        Show show=showRepository.findById(showId).orElseThrow(()->new RuntimeException("show not found"));
          for(Seat seat : seatId) {
              SeatStatus status=show.getSeatStatus().get(seat.getSeatId());
              if(status!=SeatStatus.AVAILABLE) {
                  throw new RuntimeException("Seat is not available");
              }

          }
          for(int id:seatId) {
               show.getSeatStatus().put(id,SeatStatus.BOOKED);
          }

          Booking booking=new Booking();
          booking.setUser(user);
          booking.setShow(show);
          booking.setStatus(BookingStatus.CONFIRMED);
          booking.setSeats(seatId);

          bookingRepository.save(booking);
          showRepository.save(show);
          return booking;

  }

}
