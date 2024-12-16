package com.example.service_gestion_authentification.Controller;

import com.example.service_gestion_authentification.FeignClients.AdministratorFeign;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthentificationController {

    private static final Logger logger = LoggerFactory.getLogger(AuthentificationController.class);

    private final AdministratorFeign administratorFeign;

    @Autowired
    public AuthentificationController(AdministratorFeign administratorFeign) {
        this.administratorFeign = administratorFeign;
    }

    @PostMapping("/register")
    public void registerAdmin(@RequestBody String admin) {
        logger.info("Received request to register admin: {}", admin);
        administratorFeign.RegisterAdmin(admin);
    }

    @PostMapping("/login")
    public void loginAdmin(@RequestBody String email, @RequestBody String password) {
        logger.info("Received login request for email: {}", email);
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication.isAuthenticated()) {
            logger.info("User is already authenticated");
        } else {
            logger.info("User is not authenticated");
            administratorFeign.LoginAdmin(email, password);
        }
    }
}