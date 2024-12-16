package org.example.service_performance.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/performence")
public class PerformenceController {

    @GetMapping
    public String getPerformence() {
        return "Performence";
    }
}
