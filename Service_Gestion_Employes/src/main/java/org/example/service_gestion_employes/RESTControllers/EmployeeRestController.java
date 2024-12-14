package org.example.service_gestion_employes.RESTControllers;

import org.example.service_gestion_employes.Entity.Employees;
import org.example.service_gestion_employes.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/get")
    public ResponseEntity<Iterable<Employees>> getEmployeesApi() {
        return ResponseEntity.ok(employeeService.getEmployees());
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Employees> getEmployeeByIdApi(@PathVariable Long id) {
        Employees employee = employeeService.getEmployeeById(id);
        return ResponseEntity.ok(employee);
    }

    @PostMapping("/add")
    public ResponseEntity<String> addEmployeeApi(@RequestBody Employees employee) {
        try {
            employeeService.addEmployee(employee);
            return ResponseEntity.ok("Employee added");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error adding employee: " + e.getMessage());
        }
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteEmployeeApi(@PathVariable Long id) {
        try {
            employeeService.deleteEmployee(id);
            return ResponseEntity.ok("Employee deleted");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error deleting employee: " + e.getMessage());
        }
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateEmployeeByIdApi(@PathVariable Long id, @RequestBody Employees employee) {
        try {
            Employees emp = employeeService.getEmployeeById(id);
            emp.setNom(employee.getNom());
            emp.setPrenom(employee.getPrenom());
            emp.setEmail(employee.getEmail());
            emp.setDepartement(employee.getDepartement());
            emp.setPoste(employee.getPoste());
            emp.setDateEmbauche(employee.getDateEmbauche());
            employeeService.addEmployee(emp);
            return ResponseEntity.ok("Employee updated");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("Error updating employee: " + e.getMessage());
        }
    }
}