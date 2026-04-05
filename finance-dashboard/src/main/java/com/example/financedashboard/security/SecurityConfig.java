package com.example.financedashboard.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;

import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter filter;

    public SecurityConfig(JwtFilter filter) {
        this.filter = filter;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            // ✅ disable csrf (required for H2 + APIs)
            .csrf(AbstractHttpConfigurer::disable)

            // ✅ allow H2 console frame
            .headers(headers -> headers.frameOptions(frame -> frame.disable()))

            .authorizeHttpRequests(auth -> auth
                    // ✅ allow H2 console
                    .requestMatchers("/h2-console/**").permitAll()

                    // ✅ allow login
                    .requestMatchers("/api/auth/**").permitAll()

                    // ✅ secure APIs
                    .requestMatchers("/api/finance/**").hasAnyRole("ADMIN","ANALYST")

                    .anyRequest().authenticated()
            )

            // ✅ JWT filter
            .addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);

        return http.build();
    }
}