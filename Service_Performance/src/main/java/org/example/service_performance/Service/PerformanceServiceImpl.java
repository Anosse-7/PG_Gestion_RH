package org.example.service_performance.Service;

import org.example.service_performance.DAO.PerformanceRepository;
import org.example.service_gestion_employes.Entity.PerformanceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class PerformanceServiceImpl implements PerformanceService {

    private final PerformanceRepository performanceRepository;

    @Autowired
    public PerformanceServiceImpl(PerformanceRepository performanceRepository) {
        this.performanceRepository = performanceRepository;
    }

    @Override
    public List<PerformanceData> getEmployeePerformanceDataById(Long employeeId) {
        return performanceRepository.findAllById(Collections.singleton(employeeId));
    }
    @Override
    public List<PerformanceData> getAllPerformanceData() {
        return performanceRepository.findAll();
    }

    @Override
    public PerformanceData addPerformanceData(PerformanceData performanceData) {
        return performanceRepository.save(performanceData);
    }
}
