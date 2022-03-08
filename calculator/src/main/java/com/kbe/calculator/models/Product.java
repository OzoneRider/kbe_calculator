package com.kbe.calculator.models;

public class Product {
    private float price;
    private float vat;

    public Product(){}

    public Product(float price, float vat) {
        this.vat = vat;
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getVat() {
        return vat;
    }

    public void setVat(float vat) {
        this.vat = vat;
    }
}
