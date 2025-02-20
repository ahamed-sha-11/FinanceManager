package com.ahamed.finance.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import lombok.Getter;
import lombok.Setter;

@Component
@Setter
@Getter
public class JsonUtils {

    private final ObjectMapper objectMapper;

    @Autowired
    public JsonUtils(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
        this.objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }
    
}
