package model;

import javax.swing.*;
import java.util.Arrays;

/**
 * This is the entity class of meal
 * @author Minghan Li
 * @version 1.1
 */

public class Meal {
    private String name;
    private String type;
    private String[] extraOptions;
    private double[] price;
    private String description;
    private ImageIcon image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String[] getExtraOptions() {
        return extraOptions;
    }
    public void setExtraOptions(String[] extraOptions) {
        this.extraOptions = extraOptions;
    }

    public double[] getPrice() {
        return price;
    }
    public void setPrice(double[] price) {
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

    @Override
    public String toString() {
        return "Meal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", extraOptions=" + Arrays.toString(extraOptions) +
                ", price=" + Arrays.toString(price) +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
