package com.techelevator.product;

import java.math.BigDecimal;

public class Product {
    // Properties
    private String name;
    private double price;
    private int stock;
    private String message;

    // Constructors
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.stock = 5;
        this.message = "Slurp slurp, Yum!";
    }
    // G&S

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    public String getMessage() {
        return message;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

    // Methods


}
