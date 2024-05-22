package com.example.Ticket.Booking.app.SpringBoot.service;

import com.example.Ticket.Booking.app.SpringBoot.entity.Movies;
import com.example.Ticket.Booking.app.SpringBoot.repositoty.MoviesRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepo moviesRepository;

    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }
}
