package com.diligent.smartexpensetrackerapi.tests;

import com.diligent.smartexpensetrackerapi.controller.ExpenseController;
import com.diligent.smartexpensetrackerapi.model.Expense;
import com.diligent.smartexpensetrackerapi.service.ExpenseService;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import org.springframework.http.MediaType;

import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;
import java.util.Arrays;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ExpenseController.class)
public class ExpenseControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ExpenseService expenseService;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void testAddExpense() throws Exception {

        Expense expense = new Expense(
                1L,
                "Lunch",
                250,
                "Food",
                LocalDate.now()
        );

        when(expenseService.addExpense(expense))
                .thenReturn(expense);

        mockMvc.perform(post("/expenses")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(expense)))
                .andExpect(status().isOk());
    }

    @Test
    void testGetAllExpenses() throws Exception {

        Expense expense = new Expense(
                1L,
                "Lunch",
                250,
                "Food",
                LocalDate.now()
        );

        when(expenseService.getAllExpenses())
                .thenReturn(Arrays.asList(expense));

        mockMvc.perform(get("/expenses"))
                .andExpect(status().isOk());
    }

    @Test
    void testDeleteExpense() throws Exception {

        doReturn(true)
                .when(expenseService)
                .deleteExpense(1L);

        mockMvc.perform(delete("/expenses/1"))
                .andExpect(status().isOk());
    }
}