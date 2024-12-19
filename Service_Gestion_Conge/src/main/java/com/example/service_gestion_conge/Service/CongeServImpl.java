package com.example.service_gestion_conge.Service;


import com.example.service_gestion_conge.Entity.Conge;
import com.example.service_gestion_conge.Repo.CongeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CongeServImpl implements CongeService {
    @Autowired
    private CongeRepository congeRepository;
    @Override
    public List<Conge> findAll() {
        return congeRepository.findAll();
    }
    @Override
    public Conge save(Conge conge) {
        return congeRepository.save(conge);
    }
}
