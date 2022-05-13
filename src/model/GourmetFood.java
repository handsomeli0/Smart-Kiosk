package model;

import javax.swing.*;

public class GourmetFood {
    private String name;
    private String type;
    private double price;
    private String description;
    private String image;

    public String getName() {
        return name;
    }
    public void setName(String name) {this.name = name;}

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
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

    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", image='" + image + '\'' +
                '}';
    }
}