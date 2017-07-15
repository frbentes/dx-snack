package dextra.com.br.dxsnack.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Order {

    @SerializedName("id")
    private int orderId;

    @SerializedName("id_sandwich")
    private int snackId ;

    @SerializedName("extras")
    private List<Integer> ingredients;

    @SerializedName("date")
    private String date;

    public Order(int orderId, int snackId, List<Integer> ingredients, String date) {
        this.orderId = orderId;
        this.snackId = snackId;
        this.ingredients = ingredients;
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public int getSnackId() {
        return snackId;
    }

    public List<Integer> getIngredients() {
        return ingredients;
    }

    public String getDate() {
        return date;
    }

}
