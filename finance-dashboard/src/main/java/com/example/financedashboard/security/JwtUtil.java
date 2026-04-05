package com.example.financedashboard.security;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import java.util.*;

@Component
public class JwtUtil {

    private final String SECRET = "secret";

    public String generateToken(String email, String role) {
        return Jwts.builder()
                .setSubject(email)
                .claim("role", role)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 86400000))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public Claims extract(String token) {
        return Jwts.parser().setSigningKey(SECRET)
                .parseClaimsJws(token).getBody();
    }

    public String getRole(String token) {
        return extract(token).get("role", String.class);
    }
}