package org.example.service_performance.kafka;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.service_performance.Entity.PerformanceData;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PerformanceConsumer {

    private final ObjectMapper objectMapper = new ObjectMapper();

    @KafkaListener(topics = "employee_performance", groupId = "performance-group")
    public void consume(String performanceDataJson) {
        try {
            // Deserialize JSON to PerformanceData object
            PerformanceData performanceData = objectMapper.readValue(performanceDataJson, PerformanceData.class);

            // Calculate performance score
            double performanceScore = calculatePerformanceScore(performanceData);

            // Iterate over employees and print performance score
            performanceData.getEmployees().forEach(employee -> {
                System.out.println("Employee ID: " + employee.getId() + ", Performance Score: " + performanceScore);
            });

            // Add logic to store or update the performance score in the database

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private double calculatePerformanceScore(PerformanceData performanceData) {
        // Example calculation logic
        double taskWeight = 0.5;
        double qualityWeight = 0.3;
        double hoursWeight = 0.2;

        return (performanceData.getTasksCompleted() * taskWeight) +
               (performanceData.getQualityOfWork() * qualityWeight) +
               (performanceData.getHoursWorked() * hoursWeight);
    }
}