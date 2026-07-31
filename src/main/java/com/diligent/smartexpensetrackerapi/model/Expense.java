package com.diligent.smartexpensetrackerapi.model;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public class Expense {

    private Long id;

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @Positive(message = "Amount must be greater than 0")
    private double amount;

    @NotBlank(message = "Category cannot be empty")
    private String category;

    private LocalDate date;

    // No-argument constructor
    public Expense() {
    }

    // Parameterized constructor
    public Expense(Long id, String title, double amount, String category, LocalDate date) {
        this.id = id;
        this.title = title;
        this.amount = amount;
        this.category = category;
        this.date = date;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}