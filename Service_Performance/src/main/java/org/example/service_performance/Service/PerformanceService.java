package org.example.service_performance.Service;

import org.example.service_gestion_employes.Entity.PerformanceData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PerformanceService {

    List<PerformanceData> getEmployeePerformanceDataById(Long employeeId);

    List<PerformanceData> getAllPerformanceData();

    PerformanceData addPerformanceData(PerformanceData performanceData);
}
