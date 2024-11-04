package org.example.service_gestion_employes.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
}
