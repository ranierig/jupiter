package com.jupiter.jupiterback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/healthcheck")
public class HealthCheck {
    @GetMapping
    public String healthCheck() {
        return "Checked";
    }
}
