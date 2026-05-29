# Spring Security Session Management 🔐

A Spring Boot project built to learn and understand Spring Security internals, authentication flow, JWT, custom filters, and session management.

This repository is being developed in phases, starting with user registration and security configuration, and gradually moving toward enterprise-grade authentication and session control.

---

## 🚀 Current Features (Phase 1)

### User Registration

* Register new users
* Store users in PostgreSQL
* Password hashing using BCrypt

### Spring Security Configuration

* Custom `SecurityFilterChain`
* Public endpoints using `permitAll()`
* Protected endpoints ready for future phases

### Database Integration

* PostgreSQL
* Spring Data JPA
* Hibernate ORM

---

## 🛠️ Tech Stack

* Java 21
* Spring Boot
* Spring Security
* Spring Data JPA
* PostgreSQL
* Hibernate
* Lombok
* Maven

---

## 📂 Project Structure

```text
src/main/java
│
├── controller
│   └── AuthController
│
├── service
│   └── AuthService
│
├── entity
│   └── User
│
├── repository
│   └── UserRepository
│
├── dto
│   ├── RegisterRequest
│   └── LoginRequest
│
└── config
    └── SecurityConfig
```

---

## ⚙️ Database Configuration

```yaml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5435/security_db
    username: my-user
    password: password

  jpa:
    hibernate:
      ddl-auto: update
    show-sql: true
```

---

## 🐳 PostgreSQL Docker Setup

```bash
docker run --name security-db \
-e POSTGRES_USER=my-user \
-e POSTGRES_PASSWORD=password \
-e POSTGRES_DB=security_db \
-p 5435:5432 \
-d postgres
```

---

## 🔐 Password Security

Passwords are never stored in plain text.

The application uses:

```java
BCryptPasswordEncoder
```

to hash passwords before persisting them.

Example:

```text
Raw Password:
password123

Stored Password:
$2a$10$Qn4...
```

---

## 📡 API

### Register User

**POST**

```http
/auth/register
```

Request Body:

```json
{
  "username": "kannan",
  "password": "password123"
}
```

Response:

```text
User registered successfully
```

---

## 📚 Concepts Learned

### Spring Security Basics

* SecurityFilterChain
* Authentication vs Authorization
* permitAll()
* Protected Endpoints

### Spring Data JPA

* Entity Mapping
* Repositories
* ORM Concepts

### Password Security

* BCrypt Hashing
* Secure Password Storage

### Database Integration

* PostgreSQL
* Hibernate
* Auto Table Creation

---

## 🗺️ Upcoming Phases

### Phase 2

* JWT Authentication
* Login API
* Token Generation

### Phase 3

* JWT Authentication Filter
* Protected APIs

### Phase 4

* Custom Logging Filter
* Request & Response Logging

### Phase 5

* SessionEntity
* Single Active Session per User

### Phase 6

* Token Revocation
* Database Token Validation

### Phase 7

* Deep Dive into Spring Security Internals

---

## 👨‍💻 Author

Kannan V

Learning Spring Security through hands-on implementation and internal architecture exploration.

---

## ⭐ Future Goals

Build a complete enterprise-style authentication system with:

* JWT Authentication
* Custom Filters
* Session Management
* Token Revocation
* Role-Based Authorization
* Spring Security Internals
