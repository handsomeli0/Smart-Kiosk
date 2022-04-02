package model;

import javax.swing.*;

public class GourmetFood {
    private String name;
    private String type;
    private double price;
    private String description;
    private ImageIcon image;
    private int number;
    private JButton addB=new JButton("Add");
    private JButton removeB=new JButton("Remove");

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

    public ImageIcon getImage() {
        return image;
    }
    public void setImage(ImageIcon image) {
        this.image = image;
    }

    public JButton getAdd() {
        return addB;
    }
    public void getAddB(JButton addB) {
        this.addB = addB;
    }

    public JButton getRemove() {
        return addB;
    }
    public void getRemove(JButton removeB) {
        this.removeB = removeB;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", number='" + number + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}