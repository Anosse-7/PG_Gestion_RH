package com.example.service_gestion_authentification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ServiceGestionAuthentificationApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGestionAuthentificationApplication.class, args);
    }

}
