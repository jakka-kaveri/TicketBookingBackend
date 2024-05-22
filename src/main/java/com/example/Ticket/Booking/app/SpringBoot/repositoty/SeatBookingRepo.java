package com.example.Ticket.Booking.app.SpringBoot.repositoty;

import com.example.Ticket.Booking.app.SpringBoot.entity.SeatBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatBookingRepo extends JpaRepository<SeatBooking, Integer> {
}
