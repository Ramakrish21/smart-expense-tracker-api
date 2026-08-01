package com.diligent.smartexpensetrackerapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.diligent.smartexpensetrackerapi.model.Expense;
import com.diligent.smartexpensetrackerapi.service.ExpenseService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

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

    @Operation(summary = "Get expenses by category")
    @GetMapping("/category/{category}")
    public List<Expense> getExpensesByCategory(
            @PathVariable String category) {

        return expenseService.getExpensesByCategory(category);
    }

    @Operation(summary = "Search expenses by title")
    @GetMapping("/search")
    public List<Expense> searchExpenses(
            @RequestParam String keyword) {

        return expenseService.searchExpenses(keyword);
    }

    @Operation(summary = "Get total expenses")
    @GetMapping("/total")
    public double getTotalExpenses() {
        return expenseService.getTotalExpenses();
    }

    @Operation(summary = "Get total expenses by category")
    @GetMapping("/total/{category}")
    public double getTotalExpensesByCategory(
            @PathVariable String category) {

        return expenseService.getTotalExpensesByCategory(category);
    }

    @Operation(summary = "Get monthly expense summary")
    @GetMapping("/monthly-summary")
    public double getMonthlySummary(
            @RequestParam int month,
            @RequestParam int year) {

        return expenseService.getMonthlySummary(month, year);
    }

    @Operation(summary = "Delete expense by ID")
    @DeleteMapping("/{id}")
    public String deleteExpense(@PathVariable Long id) {

        boolean deleted = expenseService.deleteExpense(id);

        if (deleted) {
            return "Expense deleted successfully";
        }

        return "Expense not found with ID: " + id;
    }
}