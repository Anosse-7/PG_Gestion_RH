package org.example.service_gestion_employes.FeignClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "service-gestion-employes")
public interface EmployeeAPI {

    @GetMapping("/employees")
    String getEmployees();

    @GetMapping("/employees/{id}")
    String getEmployeeById(@PathVariable Long id);

    @GetMapping("/employees/{email}")
    String getEmployeeByEmail(@PathVariable String email);

    @GetMapping("/employees/{departement}")
    String getEmployeeByDepartement(@PathVariable String departement);

    @GetMapping("/employees/{poste}")
    String getEmployeeByPoste(@PathVariable String poste);

    @GetMapping("/employees/{dateEmbauche}")
    String getEmployeeByDateEmbauche(@PathVariable String dateEmbauche);

    @GetMapping("/employees/{nom}")
    String getEmployeeByNom(@PathVariable String nom);

    @PostMapping("/employee/add")
    String addEmployee(@RequestBody String employee);

    @DeleteMapping("/employees/{id}")
    String deleteEmployee(@PathVariable Long id);

}
