package com.kbe.calculator.service;

import com.kbe.calculator.models.VAT;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final float PERCENT_VAT = 0.19f;

    public VAT calculateVAT(double price){
        VAT vat = new VAT();
        vat.setVatPrice(price*PERCENT_VAT);
        return vat;
    }
}
