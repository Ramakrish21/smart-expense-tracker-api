# Smart Expense Tracker API

A RESTful API built using Spring Boot to manage expenses. This application allows users to add expenses, view all expenses, filter expenses by category, calculate total expenses, and delete expenses.

## Tech Stack

- Java 21
- Spring Boot
- Maven
- Swagger / OpenAPI
- JUnit 5
- MockMvc

## Features

- Add a new expense
- View all expenses
- Filter expenses by category
- Calculate total expenses
- Calculate total expenses by category
- Delete an expense
- API documentation using Swagger
- Unit testing

---

## Project Structure

src/
├── main/
│   └── java/com/diligent/smartexpensetrackerapi/
│       ├── controller/
│       ├── model/
│       ├── service/
│       └── SmartExpenseTrackerApiApplication.java
└── test/
    └── java/com/diligent/smartexpensetrackerapi/tests/
        ├── ExpenseControllerTest.java
        └── SmartExpenseTrackerApiApplicationTests.java
---

## API Endpoints

### 1. Add Expense

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

### 2. Get All Expenses

**GET**

```text
/expenses
```

---

### 3. Get Expenses by Category

**GET**

```text
/expenses/category/Food
```

---

### 4. Get Total Expenses

**GET**

```text
/expenses/total
```

Example response:

```text
1250.0
```

---

### 5. Get Total Expenses by Category

**GET**

```text
/expenses/total/Food
```

Example response:

```text
750.0
```

---

### 6. Delete Expense

**DELETE**

```text
/expenses/1
```

Response:

```text
Expense deleted successfully
```

---

## Running the Project

Clone the repository:

```bash
git clone <repository-url>
```

Go to the project directory:

```bash
cd smart-expense-tracker-api
```

Run the application:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## Running Tests

```bash
mvnw.cmd test
```

---

## Swagger Documentation

Swagger UI:

```text
http://localhost:8080/swagger-ui/index.html
```

---

## Testing

The application is tested using:

- JUnit 5
- MockMvc
- Swagger UI
- Postman

---

## Notes

- Data is stored in memory using Java collections.
- No database is used.
- Validation is implemented using Jakarta Validation.