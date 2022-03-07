package com.kbe.calculator.service;

import com.kbe.calculator.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CalculatorService {

    @Autowired
    private RestTemplate restTemplate;
    private static final float vat = 0.19f;

    public float calculateVAT(Product product){
        return product.getPrice()*vat;
    }

}
