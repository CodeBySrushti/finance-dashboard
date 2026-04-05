package com.example.financedashboard.service;

import com.example.financedashboard.repository.FinancialRepository;
import com.example.financedashboard.entity.FinancialRecord;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DashboardService {

    private final FinancialRepository repo;

    public DashboardService(FinancialRepository repo) {
        this.repo = repo;
    }

    public Map<String, Object> getSummary() {

        List<FinancialRecord> list = repo.findByDeletedFalse();

        double income = list.stream()
                .filter(r -> r.getType().equalsIgnoreCase("INCOME"))
                .mapToDouble(FinancialRecord::getAmount).sum();

        double expense = list.stream()
                .filter(r -> r.getType().equalsIgnoreCase("EXPENSE"))
                .mapToDouble(FinancialRecord::getAmount).sum();

        Map<String, Object> map = new HashMap<>();
        map.put("income", income);
        map.put("expense", expense);
        map.put("balance", income - expense);

        return map;
    }
}