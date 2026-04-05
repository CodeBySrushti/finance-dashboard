package com.example.financedashboard.controller;

import com.example.financedashboard.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final JwtUtil util;

    public AuthController(JwtUtil util) {
        this.util = util;
    }

    @PostMapping("/login")
    public Map<String, String> login(@RequestParam String email,
                                     @RequestParam String role) {

        return Map.of("token", util.generateToken(email, role));
    }
}