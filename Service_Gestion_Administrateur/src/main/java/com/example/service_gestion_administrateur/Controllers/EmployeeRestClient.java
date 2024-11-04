package com.example.service_gestion_administrateur.Controllers;

import org.example.service_gestion_employes.FeignClients.EmployeeAPI;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeRestClient {

    private final EmployeeAPI employeeAPI;

    public EmployeeRestClient(EmployeeAPI employeeAPI) {
        this.employeeAPI = employeeAPI;
    }

    @GetMapping("/employees")
    public String getEmployees() {
        return employeeAPI.getEmployees();
    }

    @GetMapping("/employees/{id}")
    public String getEmployeeById(@PathVariable Long id) {
        return employeeAPI.getEmployeeById(id);
    }

    @PostMapping("/employee/add")
    public String addEmployee(@RequestBody String employee) {
        return employeeAPI.addEmployee(employee);
    }
}