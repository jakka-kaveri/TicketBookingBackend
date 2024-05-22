package com.example.Ticket.Booking.app.SpringBoot.service;

import com.example.Ticket.Booking.app.SpringBoot.entity.SeatBooking;
import com.example.Ticket.Booking.app.SpringBoot.repositoty.SeatBookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SeatBookingService {

    @Autowired
    private SeatBookingRepo seatBookingRepository;

//    public void saveBooking(SeatBooking booking) {
//        return seatBookingRepository.save(booking);
//    }

    public Optional<SeatBooking> getBookingsByUser(int userID) {
        return seatBookingRepository.findById(userID);
    }

    public Optional<SeatBooking> getBookingsByMovieID(int movieId) {
        return seatBookingRepository.findById(movieId);
    }
}
