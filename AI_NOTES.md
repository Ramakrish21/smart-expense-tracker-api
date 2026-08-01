# AI Usage Notes

## AI Tools Used

- ChatGPT

---

# 1. Which parts were AI-generated and which parts were written by me

## AI-assisted components

- Initial REST API structure and endpoint suggestions
- ExpenseService interface design
- ExpenseService implementation examples
- Unit test examples using JUnit and MockMvc
- Swagger/OpenAPI integration
- README template and documentation suggestions
- Suggestions for validation and error handling

## Written and implemented by me

- Spring Boot project setup and configuration
- Expense model creation (`Expense.java`)
- Controller implementation and endpoint mappings
- Service-layer business logic
- Validation annotations and request handling
- Folder structure organization
- API testing and debugging
- Integration of all project components

---

# 2. What I validated, tested, or changed in the AI output

- Verified all APIs using Swagger UI and Postman.
- Fixed request-body issues in Swagger.
- Modified the delete API to return meaningful responses when an expense ID does not exist.
- Corrected compilation and dependency issues in Maven.
- Updated the project structure to satisfy the assignment requirements.
- Reviewed all generated code and adapted it to the project's needs.
- Tested add, get, filter, total, and delete operations manually.
- Ensured that the implementation uses in-memory storage instead of a database.

---

# 3. AI suggestions that I decided not to use and why

## Database integration (MySQL)

Not used because the assignment required in-memory storage.

## Spring Security and authentication

Not implemented because authentication was outside the assignment scope.

## Docker support

Not added because it was optional and not required.

## Pagination and advanced filtering

Not implemented because the assignment only required basic filtering.

---

# Development Approach

I used ChatGPT to understand concepts, generate boilerplate code, and review parts of the implementation. All AI-generated code was manually reviewed, tested, and modified before being included in the final project.

The final implementation was validated using Swagger UI, Postman, and unit tests.