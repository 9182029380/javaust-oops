package Serialization;

import java.io.Serializable;

public class Product implements Serializable {
    private static final long serialVersionUID = 1L;
    public String name;
    public double price;
    public String description;
    public String category;
    public String brand;
    public String color;
    public String size;
    public int quantity;

    public Product(String name, double price, String description, String category, String brand, String color, String size, int quantity) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
