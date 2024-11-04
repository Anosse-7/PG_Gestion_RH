package org.example.service_gestion_employes.DAO;

import org.example.service_gestion_employes.Entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRestRepo extends JpaRepository<Employees, Long> {

    Employees findByEmail(String email);
}
