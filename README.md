# 📝 Simple Feedback API

A simple Spring Boot application that provides REST endpoints to submit and view user feedback.



## 🚀 Tech Stack

- Java 17  
- Spring Boot 3.5.3  
- Spring Data JPA  
- PostgreSQL  
- JUnit 5 & Mockito  
- Postman



## ▶️ How to Run the Project

### 1️⃣ Prerequisites

- Java 17+  
- PostgreSQL running locally  
- Maven installed



### 2️⃣ Create the PostgreSQL Database

CREATE DATABASE feedback_db;

### 3️⃣ Configure application.yml

Make sure the following configuration exists in your `src/main/resources/application.yml`:

spring:  
  datasource:  
    url: jdbc:postgresql://localhost:5432/feedback_db  
    username: postgres     # your username  
    password: admin        # your password  
  jpa:  
    hibernate:  
      ddl-auto: update  
    show-sql: true



### 4️⃣ Run the Application

Start the application using:  mvn spring-boot:run

The server will start on: http://localhost:8080


## 📬 Sample API Requests (Tested via Postman)

### ✅ Submit Feedback (POST)

- URL: http://localhost:8080/feedback  
- Method: POST  
- Headers: Content-Type: application/json
- 
- Body:

{
  "name": "Shriraj",
  "email": "patilshriraj6@gmail.com",
  "message": "This is good"
}


### ✅ View All Feedback (GET)

- URL: http://localhost:8080/feedback  
- Method: GET


## 🧪 Run Tests

To execute unit tests:

mvn test


