package com.example.financedashboard.dto;

import jakarta.validation.constraints.*;
import java.time.LocalDate;

public class FinancialDTO {

    @NotNull
    private Double amount;

    @NotBlank
    private String type;

    @NotBlank
    private String category;

    @NotNull
    private LocalDate date;

    private String notes;

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}