package com.example.service_gestion_authentification.FeignClients;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest {
    private String email;
    private String password;

    // Getters and setters
}
