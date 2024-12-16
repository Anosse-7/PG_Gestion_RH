package com.example.service_gestion_authentification.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "ServiceGestionAdministrateur")
public interface AdministratorFeign {

    @PostMapping(value="/auth/register",consumes = "application/json")
    void RegisterAdmin(@RequestBody String admin);

    @DeleteMapping
    void DeleteAdmin();

    @PostMapping(value = "/auth/login", consumes = "application/json")
    void LoginAdmin(@RequestBody String email, @RequestBody String password);

    @PutMapping
    void UpdateAdmin();
}
