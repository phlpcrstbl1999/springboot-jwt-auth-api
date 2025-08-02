// package com.example.springboot_jwt_auth_api.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// public class SecurityConfig {

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         http
//             .csrf().disable()
//             .authorizeHttpRequests()
//                 .requestMatchers("/api/auth/**").permitAll() // allow public access
//                 .anyRequest().authenticated() // all other requests need auth
//             .and()
//             .httpBasic(); // optional, for testing with browser or Postman

//         return http.build();
//     }
// }
