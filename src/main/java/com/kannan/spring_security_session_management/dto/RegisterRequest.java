package com.kannan.spring_security_session_management.dto;

public record RegisterRequest(
        String username,
        String password
) {
}
