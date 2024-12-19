package com.example.service_gestion_conge.Service;

import com.example.service_gestion_conge.Entity.Conge;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CongeService {
    public List<Conge> findAll();
    public Conge save(Conge conge);
}
