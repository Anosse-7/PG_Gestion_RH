package com.example.service_gestion_conge.Repo;

import com.example.service_gestion_conge.Entity.Conge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CongeRepository extends JpaRepository<Conge, Long> {
}
