package com.example.springboot_jwt_auth_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot_jwt_auth_api.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);
}
