package com.example.springboot_jwt_auth_api.Service;

import org.springframework.stereotype.Service;

import com.example.springboot_jwt_auth_api.Model.User;
import com.example.springboot_jwt_auth_api.dto.authenticationdto.RegisterRequestDTO;
import com.example.springboot_jwt_auth_api.repository.UserRepository;

@Service
public class AuthService {
    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // String email, String username, String password, String firstname, String middlename, String lastname
    public String register(RegisterRequestDTO dto) {
         if (userRepository.existsByEmail(dto.getEmail())) {
            return "Email already in use.";
        }
        User user = new User(dto.getEmail(), dto.getUsername(), dto.getPassword(), dto.getFirstname(), dto.getMiddlename(), dto.getLastname());
        userRepository.save(user);
        return "User registered successfully!";
    }
}
