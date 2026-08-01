# Smart Expense Tracker API

A RESTful API built using Spring Boot to manage expenses. This application allows users to add expenses, view all expenses, filter expenses by category, search expenses by title, calculate total expenses, generate monthly summaries, and delete expenses.

---

# Tech Stack

- Java 21
- Spring Boot
- Maven
- Swagger / OpenAPI
- JUnit 5
- MockMvc

---

# Features

- Add a new expense
- View all expenses
- Filter expenses by category
- Search expenses by title
- Calculate total expenses
- Calculate total expenses by category
- Calculate monthly expense summary
- Delete an expense
- API documentation using Swagger
- Unit testing

---

# Project Structure

```text
src/
├── main/
│   └── java/
│       └── com/
│           └── diligent/
│               └── smartexpensetrackerapi/
│                   ├── controller/
│                   │   └── ExpenseController.java
│                   ├── model/
│                   │   └── Expense.java
│                   ├── service/
│                   │   ├── ExpenseService.java
│                   │   └── ExpenseServiceImpl.java
│                   └── SmartExpenseTrackerApiApplication.java
│
└── test/
    └── java/
        └── com/
            └── diligent/
                └── smartexpensetrackerapi/
                    └── tests/
                        ├── ExpenseControllerTest.java
                        └── SmartExpenseTrackerApiApplicationTests.java
```

---

# Installation

Clone the repository:

```bash
git clone <repository-url>
```

Move to the project directory:

```bash
cd smart-expense-tracker-api
```

Install the dependencies:

```bash
mvnw.cmd clean install
```

---

# Running the Application

Run the Spring Boot application:

```bash
mvnw.cmd spring-boot:run
```

The server will start at:

```text
http://localhost:8080
```

---

# Running Tests

Run all test cases:

```bash
mvnw.cmd test
```

Expected output:

```text
 Tests run: 6, Failures: 0, Errors: 0, Skipped: 0
 
------------------------------------------------------------------------
BUILD SUCCESS
------------------------------------------------------------------------
```

---

# API Endpoints

## 1. Add Expense

**POST**

```text
/expenses
```

Request body:

```json
{
  "id": 1,
  "title": "Lunch",
  "amount": 250,
  "category": "Food",
  "date": "2026-07-31"
}
```

Response:

```json
{
  "id": 1,
  "title": "Lunch",
  "amount": 250,
  "category": "Food",
  "date": "2026-07-31"
}
```

---

## 2. Get All Expenses

**GET**

```text
/expenses
```

---

## 3. Get Expenses by Category

**GET**

```text
/expenses/category/Food
```

---

## 4. Search Expenses by Title

**GET**

```text
/expenses/search?keyword=Lunch
```

Example response:

```json
[
  {
    "id": 1,
    "title": "Lunch",
    "amount": 250,
    "category": "Food",
    "date": "2026-07-31"
  }
]
```

---

## 5. Get Monthly Expense Summary

**GET**

```text
/expenses/monthly-summary?month=7&year=2026
```

Example response:

```text
750.0
```

---

## 6. Get Total Expenses

**GET**

```text
/expenses/total
```

Example response:

```text
1250.0
```

---

## 7. Get Total Expenses by Category

**GET**

```text
/expenses/total/Food
```

Example response:

```text
750.0
```

---

## 8. Delete Expense

**DELETE**

```text
/expenses/1
```

Response:

```text
Expense deleted successfully
```

---

# Swagger Documentation

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

---

# Testing

The application is tested using:

- JUnit 5
- MockMvc
- Swagger UI
- Postman

---

# Additional Information

- Expenses are stored in memory using Java collections.
- No external database is used.
- Input validation is implemented using Jakarta Validation.
- Expenses can be searched by title.
- Monthly expense summaries can be generated using month and year.
- API documentation is available through Swagger UI.