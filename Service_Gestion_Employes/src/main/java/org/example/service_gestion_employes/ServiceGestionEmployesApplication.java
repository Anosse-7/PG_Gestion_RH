package org.example.service_gestion_employes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServiceGestionEmployesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceGestionEmployesApplication.class, args);
    }

}
