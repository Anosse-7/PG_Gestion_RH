// Service_Performance/src/main/java/org/example/service_performance/ServicePerformanceApplication.java
package org.example.service_performance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("org.example.service_gestion_employes.Entity")
public class ServicePerformanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServicePerformanceApplication.class, args);
    }
}