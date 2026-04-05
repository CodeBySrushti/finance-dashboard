package com.example.financedashboard.service;

import com.example.financedashboard.dto.FinancialDTO;
import com.example.financedashboard.entity.FinancialRecord;
import com.example.financedashboard.repository.FinancialRepository;

import org.springframework.stereotype.Service;
import org.springframework.data.domain.*;

@Service
public class FinancialService {

    private final FinancialRepository repo;

    public FinancialService(FinancialRepository repo) {
        this.repo = repo;
    }

    public FinancialRecord create(FinancialDTO dto) {
        FinancialRecord r = new FinancialRecord();
        

        r.setAmount(dto.getAmount());
        r.setType(dto.getType());
        r.setCategory(dto.getCategory());
        r.setDate(dto.getDate());
        r.setNotes(dto.getNotes());

        return repo.save(r);
    }

    public Page<FinancialRecord> getAll(Pageable pageable) {
        return repo.findByDeletedFalse(pageable);
    }
}