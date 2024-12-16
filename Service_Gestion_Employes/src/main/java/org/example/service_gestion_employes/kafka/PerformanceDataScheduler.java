package org.example.service_gestion_employes.kafka;

import org.example.service_gestion_employes.Entity.Employees;
import org.example.service_gestion_employes.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PerformanceDataScheduler {

    private final PerformanceDataCollector performanceDataCollector;
    private final EmployeeService employeeService;

    @Autowired
    public PerformanceDataScheduler(PerformanceDataCollector performanceDataCollector, EmployeeService employeeService) {
        this.performanceDataCollector = performanceDataCollector;
        this.employeeService = employeeService;
    }

    @Scheduled(fixedRate = 60000) // Schedule to run every 60 seconds
    public void schedulePerformanceDataCollection() {
        // Fetch the list of employees (replace with actual logic)
        List<Employees> employees = fetchEmployees();

        // Collect and send performance data
        performanceDataCollector.collectAndSendPerformanceData(employees);
    }

    private List<Employees> fetchEmployees() {
        return employeeService.getEmployees(); // Placeholder
    }
}