package com.service;

import com.dto.RegisterRequest;
import com.model.User;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class AuthService {
    public void signup(RegisterRequest registerRequest){
        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(registerRequest.getPassword());
        user.setCreated(Instant.now());
        user.setEnabled(false);
    }
}
