package com.example.service_gestion_conge.ControllerServ;

import com.example.service_gestion_conge.Entity.Conge;
import com.example.service_gestion_conge.Service.CongeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conges")
public class CongeController {
    @Autowired
    private CongeService congeService;

    @GetMapping
    public List<Conge> getAllConges() {
        return congeService.findAll();
    }

    @PostMapping
    public ResponseEntity<Conge> createConge(@RequestBody Conge conge) {
        return ResponseEntity.ok(congeService.save(conge));
    }
}
