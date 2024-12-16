package org.example.service_gestion_employes.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employees {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String password;
    private String departement;
    private String poste;
    private String dateEmbauche;

    @ManyToOne
    @JoinColumn(name = "performanceData_id")
    private PerformanceData performanceData;
}
