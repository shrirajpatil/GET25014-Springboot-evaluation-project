# Simple Feedback API

A simple Spring Boot application that provides REST endpoints to submit and view user feedback.



## Tech Stack

- Java 17  
- Spring Boot 3.5.3  
- Spring Data JPA  
- PostgreSQL  
- JUnit 5 & Mockito  
- Postman



## How to Run the Project

### Prerequisites

- Java 17+  
- PostgreSQL running locally  
- Maven installed



### Create the PostgreSQL Database

  `CREATE DATABASE feedback_db;`

### Configure application.yml

Make sure the following configuration exists in your `src/main/resources/application.yml`:

spring:  `
  datasource:  `
    url: jdbc:postgresql://localhost:5432/feedback_db  
    username: postgres      # your username 
    password: admin         # your password  
  jpa:
    hibernate:  
      ddl-auto: update  
    show-sql: true





### Run the Application

Start the application using:  `mvn spring-boot:run`



<img width="1919" height="351" alt="image" src="https://github.com/user-attachments/assets/a007bfef-9f48-4f8d-918f-65236a760aa7" />




The server will start on: `http://localhost:8080`




## Sample API Requests (Tested via Postman)

### Submit Feedback (POST)

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



<img width="1913" height="1021" alt="image" src="https://github.com/user-attachments/assets/bb60d1c6-81f0-4d35-bd42-abf7ef619d21" />





### View All Feedback (GET)

- URL: `http://localhost:8080/feedback`  
- Method: GET



- <img width="1919" height="1019" alt="image" src="https://github.com/user-attachments/assets/bd7137d7-0271-4c28-84c7-cbd40416a483" />





## Run Tests

To execute unit tests:

`mvn test`



<img width="1829" height="602" alt="image" src="https://github.com/user-attachments/assets/b9356ec1-982c-4b4e-9b63-595e1700853e" />



