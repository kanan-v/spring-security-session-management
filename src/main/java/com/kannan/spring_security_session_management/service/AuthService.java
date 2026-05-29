package com.kannan.spring_security_session_management.service;

import com.kannan.spring_security_session_management.dto.RegisterRequest;
import com.kannan.spring_security_session_management.entity.User;
import com.kannan.spring_security_session_management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public String register(RegisterRequest request) {

        User user = User.builder()
                .username(request.username())
                .password(
                        passwordEncoder.encode(
                                request.password()
                        )
                )
                .role("USER")
                .build();

        userRepository.save(user);

        return "User registered successfully";
    }
}
