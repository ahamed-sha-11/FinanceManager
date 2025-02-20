package com.ahamed.finance.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ahamed.finance.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
@RequestMapping("/transactions")
public class FinanceController {

    private final JsonUtils jsonUtils;

    @Autowired
    public FinanceController(JsonUtils jsonUtils) {
        this.jsonUtils = jsonUtils;
    }

    @GetMapping("/")
    public ResponseEntity<Object> getAllTransactions() throws JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("message", "Welcome to Finance Application");
        return new ResponseEntity<>(jsonUtils.getObjectMapper().writeValueAsString(map), HttpStatus.OK);
    }

    @GetMapping("/health")
    public String health() {
        return "Finance Application is up and running";
    }
}
