package org.example.service_performance.DAO;

import org.example.service_gestion_employes.Entity.PerformanceData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerformanceRepository extends JpaRepository<PerformanceData, Long>{
}
