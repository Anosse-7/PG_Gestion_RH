package com.example.service_gestion_administrateur;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceGestionAdministrateur {

    public static void main(String[] args) {

        SpringApplication.run(ServiceGestionAdministrateur.class, args);
    }
}
