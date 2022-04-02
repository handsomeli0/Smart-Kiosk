package model;

import javax.swing.*;

public class GourmetFood {
    private String name;
    private String type;
    private double price;
    private String description;
    private ImageIcon image;
    private int count=0;

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

    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public ImageIcon getImage() {
        return image;
    }
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number='" + count + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}