package com.example.loginsap;

public class Product {
    private int id;
    private String productName;
    private int amount;
    private String description;

    public Product(String id, String productName, String amount, String description) {
        this.id = Integer.parseInt(id);
        this.productName = productName;
        this.amount = Integer.parseInt(amount);
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
