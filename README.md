---

# 📝 Task Manager API

RESTful API for task management with JWT authentication. Project created for practicing **Spring Security** and **JWT**, using **PostgreSQL** in the main environment and **H2** as the test database.

---

## 🚀 Technologies Used

* Java 17+
* Spring Boot
* Spring Security
* JWT (JSON Web Token)
* Maven
* Spring Data JPA
* PostgreSQL (production)
* H2 Database (testing)

---

## 🎯 Project Goal

This project was developed with the purpose of **practicing JWT-based security implementation** in Spring Boot applications, as well as consolidating concepts of authentication, access control, and entity management via RESTful API.

---

## 🔐 Authentication

Authentication uses JWT tokens. You need to register first and then log in to obtain a token.

### 🔸 User Registration

`POST /auth/register`

```json
{
  "login": "user123",
  "password": "password123",
  "role": "USER"
}
```

### 🔸 Login

`POST /auth/login`

```json
{
  "login": "user123",
  "password": "password123"
}
```

**Response:**

```json
{
  "token": "Bearer <your_token_here>"
}
```

---

## 📌 Task Endpoints

🔐 All endpoints require the JWT token in the header:

```
Authorization: Bearer <your_token>
```

### 🔹 List Tasks

`GET /tasks`

**Response:**

```json
[
  {
    "id": 1,
    "title": "Study Spring",
    "description": "JWT + Security"
  },
  ...
]
```

### 🔹 Create New Task

`POST /tasks`

```json
{
  "title": "New task",
  "description": "Task description"
}
```

---

## ⚙️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/yourusername/taskmanager.git
cd taskmanager
```

2. Configure the database in `application.properties`:

For **PostgreSQL**:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/taskdb
spring.datasource.username=your_username
spring.datasource.password=your_password
```

For **H2 (testing)**:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.h2.console.enabled=true
```

3. Build and run:

```bash
./mvnw clean install
./mvnw spring-boot:run
```

---

## 🗂️ Project Structure

```
src/
├── controller/
├── dto/
├── entities/
├── repositories/
├── services/
└── infra/security/
```

---

## ✍️ Author

Henrique Coqueiro de Melo
Educational project

---
