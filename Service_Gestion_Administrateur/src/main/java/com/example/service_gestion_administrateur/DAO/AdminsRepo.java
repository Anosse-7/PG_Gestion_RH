package com.example.service_gestion_administrateur.DAO;

import com.example.service_gestion_administrateur.Entitys.Admins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdminsRepo extends JpaRepository<Admins, Long> {

    Admins findByEmail(String email);
}
