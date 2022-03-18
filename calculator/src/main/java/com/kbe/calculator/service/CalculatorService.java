package com.kbe.calculator.service;

import com.kbe.calculator.models.VAT;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorService {

    private static final BigDecimal PERCENT_VAT = new BigDecimal("0.19");

    public VAT calculateVAT(double price){
        VAT vat = new VAT();
        vat.setVatPrice(PERCENT_VAT.multiply(BigDecimal.valueOf(price)));
        return vat;
    }
}
