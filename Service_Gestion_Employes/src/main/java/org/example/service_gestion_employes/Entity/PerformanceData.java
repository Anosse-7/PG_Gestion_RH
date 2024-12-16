package org.example.service_gestion_employes.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PerformanceData {

    @Id
    @GeneratedValue
    private Long id;
    private int tasksCompleted;
    private double qualityOfWork;
    private int hoursWorked;
    private Date evaluationDate;
    private double score;
    @OneToMany
    private List<Employees> employees;
}
