package org.example.service_gestion_employes.Service;

import org.example.service_gestion_employes.Entity.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    Employees addEmployee(Employees employee);
    List<Employees> getEmployees();
    void deleteEmployee(Long id);
    Employees getEmployeeById(Long id);
}
