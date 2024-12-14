package org.example.service_gestion_employes.kafka;// File: Service_Employee/src/main/java/com/example/service_employee/kafka/PerformanceProducer.java


import org.example.service_performance.Entity.PerformanceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PerformanceProducer {

    private static final String TOPIC = "employee_performance";

    @Autowired
    private KafkaTemplate<String, PerformanceData> kafkaTemplate;

    public void sendPerformanceData(PerformanceData performanceData) {
        kafkaTemplate.send(TOPIC, performanceData);
    }
}