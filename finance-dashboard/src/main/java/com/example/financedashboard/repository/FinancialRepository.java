package com.example.financedashboard.repository;

import com.example.financedashboard.entity.FinancialRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.*;

import java.util.List;

public interface FinancialRepository extends JpaRepository<FinancialRecord, Long> {

    Page<FinancialRecord> findByDeletedFalse(Pageable pageable);
    List<FinancialRecord> findByDeletedFalse();
}