package com.example.Ticket.Booking.app.SpringBoot.controller;

import com.example.Ticket.Booking.app.SpringBoot.entity.Movies;
import com.example.Ticket.Booking.app.SpringBoot.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/movies")
public class MoviesController {

    @Autowired
    private MoviesService movieService;

    @GetMapping("/")
    public List<Movies> getAllMovies() {
        return movieService.getAllMovies();
    }

}
