package com.techelevator;

import java.math.BigDecimal;

public class Product {
    // Properties
    private String name;
    private double price;
    private int stock;
    private String type;

    // Constructors
    public Product(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
        this.stock = 5;
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

    // Methods

    public String getMessage() {
        String message = "";
        if (this.type == "Chip") {
            message = "Crunch crunch, yum!";
        }
        else if (this.type == "Candy") {
            message = "Munch munch, yum!";
        }
        else if (this.type == "Drink") {
            message = "Slurp slurp, yum!";
        }
        else if (this.type == "Gum") {
            message = "Chew chew, yum!";
        }
        return message;
    }


}
