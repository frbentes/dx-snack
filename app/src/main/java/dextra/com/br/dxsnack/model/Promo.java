package dextra.com.br.dxsnack.model;

import com.google.gson.annotations.SerializedName;

public class Promo {

    @SerializedName("id")
    private int promoId;

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    public Promo(int promoId, String name, String description) {
        this.promoId = promoId;
        this.name = name;
        this.description = description;
    }

    public int getPromoId() {
        return promoId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

}
