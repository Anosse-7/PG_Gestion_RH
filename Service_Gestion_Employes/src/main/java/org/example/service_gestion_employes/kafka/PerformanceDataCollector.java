package org.example.service_gestion_employes.kafka;

import org.example.service_gestion_employes.Entity.Employees;
import org.example.service_gestion_employes.Entity.PerformanceData;
import org.example.service_gestion_employes.kafka.PerformanceProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PerformanceDataCollector {

    private final PerformanceProducer performanceProducer;

    @Autowired
    public PerformanceDataCollector(PerformanceProducer performanceProducer) {
        this.performanceProducer = performanceProducer;
    }

    public void collectAndSendPerformanceData(List<Employees> employees) {
        // Collect performance data (this is just an example, replace with actual logic)
        PerformanceData performanceData = new PerformanceData();
        performanceData.setTasksCompleted(10);
        performanceData.setQualityOfWork(8.5);
        performanceData.setHoursWorked(40);
        performanceData.setEvaluationDate(new Date());
        performanceData.setEmployees(employees);

        // Send performance data to Kafka
        performanceProducer.sendPerformanceData(performanceData);
    }
}