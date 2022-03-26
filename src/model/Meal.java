package model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.ArrayList;

public class Meal {
    private String name;
    private String type;
    private String[] extraOptions;
    private double[] price;
    private String description;
    private String image;

    public Meal(String name, String type, String[] extraOptions, double[] price, String description, String image) {
        this.name = name;
        this.type = type;
        this.extraOptions = extraOptions;
        this.price = price;
        this.description = description;
        this.image = image;
    }

    public Meal(String name, String type, String description) {
        this.name = name;
        this.type = type;
        this.extraOptions = new String[] {"No Pepper", "Big"};
        this.price = new double[] {0, 9.9};
        this.description = description;
        this.image = name+".jpg";
    }

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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

//    public static void main(String[] args) {
//        ArrayList<Meal> arrayList = new ArrayList<>();
//        arrayList.add(new Meal("Whole Wheat Chicken Sandwich", "Standard",
//                "The best choice for weight loss and fitness people."));
//        arrayList.add(new Meal("Vegetable Salad", "Vegetarian",
//                "Ingredients: cucumber, red bell pepper, onion, tomato, broccoli, and etc."));
//        arrayList.add(new Meal("Halal Guys Chicken and Rice", "Halal",
//                "The perfect combination of delicious marinated chicken, buttery turmeric and cumin spiced rice, and an addictive white sauce that brings the whole thing together."));
//        JSONArray jsonArray = (JSONArray) JSON.toJSON(arrayList);
//        System.out.println(jsonArray);
//    }
}
