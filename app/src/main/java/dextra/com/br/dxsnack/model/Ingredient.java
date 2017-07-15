package dextra.com.br.dxsnack.model;

import com.google.gson.annotations.SerializedName;

public class Ingredient {

    @SerializedName("id")
    private int ingredientId;

    @SerializedName("name")
    private String name;

    @SerializedName("price")
    private double price;

    @SerializedName("image")
    private String imageUrl;

    public Ingredient(int ingredientId, String name, double price, String imageUrl) {
        this.ingredientId = ingredientId;
        this.name = name;
        this.price = price;
        this.imageUrl = imageUrl;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
