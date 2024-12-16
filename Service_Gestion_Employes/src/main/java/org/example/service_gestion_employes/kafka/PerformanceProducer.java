package org.example.service_gestion_employes.kafka;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.service_gestion_employes.Entity.PerformanceData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PerformanceProducer {

    private static final String TOPIC = "employee_performance";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;


    public void sendPerformanceData(PerformanceData performanceData) {
        try {
            // Serialize PerformanceData to JSON
            String performanceDataJson = objectMapper.writeValueAsString(performanceData);
            // Send JSON to Kafka topic
            kafkaTemplate.send(TOPIC, performanceDataJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}