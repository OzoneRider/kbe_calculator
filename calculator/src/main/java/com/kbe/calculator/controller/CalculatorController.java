package com.kbe.calculator.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.kbe.calculator.models.VAT;
import com.kbe.calculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/vat")
    public VAT calculateVAT(@RequestParam("price") Double price){
        return calculatorService.calculateVAT(price);
    }
}
