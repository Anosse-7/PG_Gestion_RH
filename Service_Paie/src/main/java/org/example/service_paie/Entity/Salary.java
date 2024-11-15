package org.example.service_paie.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class Salary{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long employeeId; // ID de l'employé

    private BigDecimal basicSalary; // Salaire de base
    private BigDecimal bonuses; // Bonus, primes, etc.
    private BigDecimal deductions; // Déductions (impôts, cotisations sociales, etc.)

    private LocalDate payrollDate; // Date de la paie (peut être mensuelle, par exemple)

    public Salary() {
    }

    public Salary(Long employeeId, BigDecimal basicSalary, BigDecimal bonuses, BigDecimal deductions, LocalDate payrollDate) {
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
        this.bonuses = bonuses;
        this.deductions = deductions;
        this.payrollDate = payrollDate;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(BigDecimal basicSalary) {
        this.basicSalary = basicSalary;
    }

    public BigDecimal getBonuses() {
        return bonuses;
    }

    public void setBonuses(BigDecimal bonuses) {
        this.bonuses = bonuses;
    }

    public BigDecimal getDeductions() {
        return deductions;
    }

    public void setDeductions(BigDecimal deductions) {
        this.deductions = deductions;
    }

    public LocalDate getPayrollDate() {
        return payrollDate;
    }

    public void setPayrollDate(LocalDate payrollDate) {
        this.payrollDate = payrollDate;
    }

    public BigDecimal getNetSalary() {
        return basicSalary.add(bonuses).subtract(deductions);
    }
}
