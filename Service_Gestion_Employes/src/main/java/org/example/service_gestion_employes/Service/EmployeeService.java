package org.example.service_gestion_employes.Service;

import org.example.service_gestion_employes.Entity.Employees;
import org.springframework.stereotype.Service;

@Service
public interface EmployeeService {
    Employees addEmployee(Employees employee);
}
