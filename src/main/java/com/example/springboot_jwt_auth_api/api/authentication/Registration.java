package com.example.springboot_jwt_auth_api.api.authentication;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Registration {

    @GetMapping("/hello")
    public String testHello() {
        return "Hello World";
    }
}
