package com.example.service_gestion_administrateur.Controllers;

import com.example.service_gestion_administrateur.DAO.AdminsRepo;
import com.example.service_gestion_administrateur.Entitys.Admins;
import com.example.service_gestion_administrateur.Services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthentificationAdmin {

    private final AdminService adminService;

    @Autowired
    public AuthentificationAdmin(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/register")
    public void RegisterAdmin(@RequestBody Admins admin) {
        adminService.addAdmin(admin);
    }

    @PostMapping
    public void loginAdmin(@RequestBody String email, @RequestBody String password) {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

    }
}
