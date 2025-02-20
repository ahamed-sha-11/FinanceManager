package com.ahamed.finance.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinanceController {
    
    @GetMapping("/")
    public String home() {
        return "Welcome to Finance Application";
    }

    @GetMapping("/helth")
    public String health() {
        return "Finance Application is up and running";
    }
}
