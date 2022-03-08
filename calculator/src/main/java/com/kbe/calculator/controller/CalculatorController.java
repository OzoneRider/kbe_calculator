package com.kbe.calculator.controller;

import com.kbe.calculator.models.Product;
import com.kbe.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/")
    public Product calculateVAT(@RequestBody Product product){
        return calculatorService.calculateVAT(product);
    }
}
