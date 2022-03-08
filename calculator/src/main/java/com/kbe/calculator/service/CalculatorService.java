package com.kbe.calculator.service;

import com.kbe.calculator.models.Product;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private static final float VAT = 0.19f;

    public Product calculateVAT(Product product){
        product.setVat(product.getPrice()*VAT);
        return product;
    }

}
