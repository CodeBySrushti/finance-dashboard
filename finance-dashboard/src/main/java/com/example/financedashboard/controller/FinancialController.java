package com.example.financedashboard.controller;

import com.example.financedashboard.dto.FinancialDTO;
import com.example.financedashboard.service.FinancialService;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.data.domain.*;

@RestController
@RequestMapping("/api/finance")
public class FinancialController {

    private final FinancialService service;

    public FinancialController(FinancialService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody FinancialDTO dto) {
        return ResponseEntity.ok(service.create(dto));
    }

    @GetMapping
    public ResponseEntity<?> getAll(Pageable pageable) {
        return ResponseEntity.ok(service.getAll(pageable));
    }
}