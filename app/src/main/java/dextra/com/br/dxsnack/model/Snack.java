package dextra.com.br.dxsnack.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Snack {

    @SerializedName("id")
    private int snackId;

    @SerializedName("name")
    private String name;

    @SerializedName("ingredients")
    private List<Integer> ingredients;

    @SerializedName("image")
    private String imageUrl;

    public Snack(int snackId, String name, List<Integer> ingredients, String imageUrl) {
        this.snackId = snackId;
        this.name = name;
        this.ingredients = ingredients;
        this.imageUrl = imageUrl;
    }

    public int getSnackId() {
        return snackId;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getIngredients() {
        return ingredients;
    }

    public String getImageUrl() {
        return imageUrl;
    }

}
