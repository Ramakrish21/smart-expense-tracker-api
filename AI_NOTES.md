# AI Usage Notes

## AI Tools Used

- ChatGPT

---

## 1. Which parts were AI-generated and which parts were written by me

### AI-assisted components

- Initial REST API structure
- ExpenseService interface design
- ExpenseService implementation suggestions
- Unit test examples using JUnit and MockMvc
- Swagger/OpenAPI integration
- README template
- Documentation suggestions

### Written and implemented by me

- Spring Boot project setup
- Expense model creation
- Controller implementation
- API endpoint mappings
- Business logic adjustments
- Validation annotations
- Folder structure organization
- API testing and debugging

---

## 2. What I validated, tested, or changed in the AI output

- Verified all APIs using Swagger UI and Postman.
- Fixed request-body issues in Swagger.
- Modified the delete API to return meaningful messages.
- Corrected compilation and dependency issues.
- Updated the project structure to satisfy assignment requirements.
- Tested add, get, filter, total, and delete operations manually.
- Reviewed and adjusted the generated code before using it.

---

## 3. AI suggestions that I decided not to use and why

### Database integration (MySQL)

Not used because the assignment required in-memory storage.

### Spring Security and authentication

Not implemented because authentication was outside the assignment scope.

### Docker support

Not added because it was optional and not required.

### Pagination and advanced filtering

Not implemented because the assignment only required basic filtering.

---

## Development Approach

I used ChatGPT to understand concepts, generate boilerplate code, and review parts of the implementation. All generated code was manually reviewed, tested, and modified to ensure that it met the assignment requirements.

The final implementation was validated using Swagger UI, Postman, and unit tests.