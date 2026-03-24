package com.example.task6.controller;

import com.example.task6.model.User;
import com.example.task6.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@Valid @RequestBody User user) {
        User savedUser = authService.register(user);
        return ResponseEntity.ok(savedUser);
        
        
    }
    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody User user) {

        String token = authService.login(user.getEmail(), user.getPassword());

        return ResponseEntity.ok(token);
    }
}