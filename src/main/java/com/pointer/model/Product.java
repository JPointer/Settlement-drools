package com.pointer.model;

public class Product {

    private double purchasePrice;
    private double sellPrice;

    public Product(double purchasePrice, double sellPrice) {
        this.purchasePrice = purchasePrice;
        this.sellPrice = sellPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}
