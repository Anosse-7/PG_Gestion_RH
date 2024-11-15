package org.example.service_gestion_employes.Service;

import org.example.service_gestion_employes.DAO.EmployeeRestRepo;
import org.example.service_gestion_employes.Entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("EmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRestRepo employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRestRepo employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employees addEmployee(Employees employee) {
        return employeeRepository.save(employee);
    }
}
