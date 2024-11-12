package org.example.service_gestion_employes.RESTControllers;

import org.example.service_gestion_employes.Entity.Employees;
import org.example.service_gestion_employes.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/addemployee")
    public String addEmployee(@RequestBody Employees employee) {
        employeeService.addEmployee(employee);
        return "Employee added";
    }
}
