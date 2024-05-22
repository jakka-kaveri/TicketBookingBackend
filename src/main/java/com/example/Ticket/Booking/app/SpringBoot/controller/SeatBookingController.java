package com.example.Ticket.Booking.app.SpringBoot.controller;

import com.example.Ticket.Booking.app.SpringBoot.entity.SeatBooking;
import com.example.Ticket.Booking.app.SpringBoot.repositoty.SeatBookingRepo;
import com.example.Ticket.Booking.app.SpringBoot.service.SeatBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/bookings")
public class SeatBookingController {
    @Autowired
    private SeatBookingService seatBookingService;

//    @PostMapping
//    public SeatBooking bookSeat(@RequestBody SeatBooking booking) {
//        return seatBookingService.saveBooking(booking);
//    }

    @GetMapping("/user/{userID}")
    public Optional<SeatBooking> getUserBookings(@PathVariable int userID) {
        return seatBookingService.getBookingsByUser(userID);
    }

    @GetMapping("/movie/{movieId}")
    public List<Integer> getAvailableSeats(@PathVariable int movieID) {
        Optional<SeatBooking> bookings = seatBookingService.getBookingsByMovieID(movieID);
    }
}
