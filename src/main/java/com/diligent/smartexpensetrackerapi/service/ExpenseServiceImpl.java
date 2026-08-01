package com.diligent.smartexpensetrackerapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.diligent.smartexpensetrackerapi.model.Expense;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final List<Expense> expenses = new ArrayList<>();

    @Override
    public Expense addExpense(Expense expense) {
        expenses.add(expense);
        return expense;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenses;
    }

    @Override
    public List<Expense> getExpensesByCategory(String category) {

        List<Expense> filteredExpenses = new ArrayList<>();

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                filteredExpenses.add(expense);
            }
        }

        return filteredExpenses;
    }

    @Override
    public double getTotalExpenses() {

        double total = 0;

        for (Expense expense : expenses) {
            total += expense.getAmount();
        }

        return total;
    }

    @Override
    public double getTotalExpensesByCategory(String category) {

        double total = 0;

        for (Expense expense : expenses) {
            if (expense.getCategory().equalsIgnoreCase(category)) {
                total += expense.getAmount();
            }
        }

        return total;
    }

    @Override
    public boolean deleteExpense(Long id) {
        return expenses.removeIf(expense -> expense.getId().equals(id));
    }

    @Override
    public List<Expense> searchExpenses(String keyword) {

        List<Expense> result = new ArrayList<>();

        for (Expense expense : expenses) {

            if (expense.getTitle()
                    .toLowerCase()
                    .contains(keyword.toLowerCase())) {

                result.add(expense);
            }
        }

        return result;
    }

    @Override
    public double getMonthlySummary(int month, int year) {

        double total = 0;

        for (Expense expense : expenses) {

            if (expense.getDate().getMonthValue() == month
                    && expense.getDate().getYear() == year) {

                total += expense.getAmount();
            }
        }

        return total;
    }
}