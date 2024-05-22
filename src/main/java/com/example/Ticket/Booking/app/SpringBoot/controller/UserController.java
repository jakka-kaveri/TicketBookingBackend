package com.example.Ticket.Booking.app.SpringBoot.controller;

import com.example.Ticket.Booking.app.SpringBoot.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping("/api/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestBody User user) {
        User existingUser = userService.getUserById(user.getName());
        if (existingUser == null) {
            return userService.saveUser(user);
        }
        return existingUser;
    }
}
