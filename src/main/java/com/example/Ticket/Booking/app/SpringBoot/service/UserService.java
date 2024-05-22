package com.example.Ticket.Booking.app.SpringBoot.service;

import com.example.Ticket.Booking.app.SpringBoot.repositoty.UserRepo;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepository;

    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(int userID) {
        return userRepository.findById(userID).orElse(null);
    }
}
