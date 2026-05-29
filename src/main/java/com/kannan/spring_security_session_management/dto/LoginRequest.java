package com.kannan.spring_security_session_management.dto;

public record LoginRequest(
        String username,
        String password
) {
}
