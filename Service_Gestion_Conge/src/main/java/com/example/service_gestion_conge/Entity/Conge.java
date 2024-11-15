package com.example.service_gestion_conge.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Conge {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String employeeId;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String typeConge; // ex: annuel, maladie, etc.

    // Getters et Setters
}