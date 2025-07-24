package com.example.feedback.dto;

import jakarta.validation.constraints.*;

public class FeedbackDTO {

    @NotBlank
    @Size(min = 3, message = "Name must be atleast 3characters")
    private String name;

    @NotBlank
    @Email(message = "Invalid email format")
    private String email;

    @NotBlank
    @Size(min = 10, message = "Message must be at least 10characters")
    private String message;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}
