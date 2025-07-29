7-Day Java API with JWT Roadmap

Estimated Time per Day: 2–4 hours
Learning by building a real project: Secure User API

Day 1: Java & Spring Boot Basics

Learn:
    Java classes, methods, variables
    What is Spring Boot and how it works
    REST API concepts (@RestController, @GetMapping)

Do:
    Install Java 17, Maven, and IntelliJ/VS Code
    Create your first Spring Boot app
    Make a simple GET /hello endpoint

Resources:
    Spring Initializr
    Spring Boot Hello World

Day 2: Build the Basic CRUD API

Learn:
    How to use @PostMapping, @GetMapping, @PathVariable, @RequestBody
    Understand @Entity, @Id, @GeneratedValue
    Introduction to H2 database or MySQL

Do:
    Create User entity
    Build endpoints:
    POST /users
    GET /users
    GET /users/{id}
    DELETE /users/{id}
    Save and fetch from H2

Day 3: Spring Security Fundamentals

Learn:
    How Spring Security works
    Authentication vs Authorization
    Password encryption with BCrypt

Do:
    Add Spring Security dependency
    Create UserDetailsService
    Hash user passwords with BCryptPasswordEncoder
    Create register endpoint to save new users securely

Day 4: Add JWT Authentication

Learn:
    What is JWT (structure: header, payload, signature)
    How to generate and validate JWT

Do:
    Install jjwt dependencies
    Create JwtUtil for token generation/validation
    Create login endpoint that returns a token

Test:
    Use Postman to POST /auth/login
    Copy and use the JWT in headers

Day 5: Protect API Routes with JWT

Learn:
    Custom JwtFilter using OncePerRequestFilter
    Use SecurityContextHolder to set auth in context

Do:
    Implement JwtFilter
    Apply filter in SecurityConfig
    Make /users/** secured (require token)
    Allow /auth/** to be public

Day 6: Role-Based Access & Exception Handling

Learn:
    Add roles to users (ADMIN, USER)
    Restrict actions using @PreAuthorize
    Global exception handling with @ControllerAdvice

Do:
    Add role field to User
    Add @PreAuthorize("hasRole('ADMIN')") on delete route
    Handle unauthorized access cleanly

Day 7: Final Polish, Testing & Deployment

Learn:
    Swagger (API documentation)
    Deploying to Heroku or Railway
    Writing tests with JUnit and MockMvc (optional)

Do:
    Add Swagger using springdoc-openapi
    Test all routes (login, protected, public)
    Deploy to Heroku (free-tier) or Railway
    Push project to GitHub

End Product: Secure User Management API
    POST /auth/register
    POST /auth/login
    GET /users (requires JWT)
    DELETE /users/{id} (admin only)


Use https://jwt.io/ to inspect your tokens
Keep your secret in application.properties
Use @Valid and @NotNull for request validation

