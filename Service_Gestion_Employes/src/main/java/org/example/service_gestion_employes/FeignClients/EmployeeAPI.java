package org.example.service_gestion_employes.FeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "ServiceGestionEmployes")
public interface EmployeeAPI {

    @GetMapping("/employees/get")
    String getEmployees();

    @GetMapping("/employees/get/{id}")
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

    @PostMapping(value = "/employees/add", consumes = "application/json")
    String addEmployee(@RequestBody String employee);

    @DeleteMapping("/employees/delete/{id}")
    String deleteEmployee(@PathVariable Long id);
}
