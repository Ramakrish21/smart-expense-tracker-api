package com.diligent.smartexpensetrackerapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diligent.smartexpensetrackerapi.model.Expense;
import com.diligent.smartexpensetrackerapi.service.ExpenseService;

import jakarta.validation.Valid;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @Operation(summary = "Add a new expense")
    @PostMapping
    public Expense addExpense(@Valid @RequestBody Expense expense) {
        return expenseService.addExpense(expense);
    }

    @Operation(summary = "Get all expenses")
    @GetMapping
    public List<Expense> getAllExpenses() {
        return expenseService.getAllExpenses();
    }

    @Operation(summary = "Delete expense by ID")
    @GetMapping("/category/{category}")
    public List<Expense> getExpensesByCategory(
            @PathVariable String category) {

        return expenseService.getExpensesByCategory(category);
    }

    @GetMapping("/total")
    public double getTotalExpenses() {
        return expenseService.getTotalExpenses();
    }

    @GetMapping("/total/{category}")
    public double getTotalExpensesByCategory(
            @PathVariable String category) {

        return expenseService.getTotalExpensesByCategory(category);
    }

    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {

        boolean deleted = expenseService.deleteExpense(id);

        if (deleted) {
            return "Expense deleted successfully";
        }

        return "Expense not found with ID: " + id;
    }
}