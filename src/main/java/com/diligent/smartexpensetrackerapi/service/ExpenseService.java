package com.diligent.smartexpensetrackerapi.service;


import java.util.List;

import com.diligent.smartexpensetrackerapi.model.Expense;

public interface ExpenseService {

    Expense addExpense(Expense expense);

    List<Expense> getAllExpenses();

    List<Expense> getExpensesByCategory(String category);

    double getTotalExpenses();

    double getTotalExpensesByCategory(String category);

    boolean deleteExpense(Long id);
    
}
