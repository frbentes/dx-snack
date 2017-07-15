package dextra.com.br.dxsnack.network;

import com.google.gson.JsonArray;

import java.util.List;

import dextra.com.br.dxsnack.model.Ingredient;
import dextra.com.br.dxsnack.model.Order;
import dextra.com.br.dxsnack.model.Promo;
import dextra.com.br.dxsnack.model.Snack;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface DxApi {

    @GET("/api/lanche")
    Call<List<Snack>> getSnacks();

    @GET("/api/lanche/{id_sandwich}")
    Call<Snack> getSnack(@Path("id_sandwich") int snackId);

    @GET("/api/ingrediente")
    Call<List<Ingredient>> getIngredients();

    @GET("/api/ingrediente/de/{id_sandwich}")
    Call<Ingredient> getIngredient(@Path("id_sandwich") int snackId);

    @GET("/api/promocao")
    Call<List<Promo>> getPromos();

    @GET("/api/pedido")
    Call<List<Order>> getOrders();

    @PUT("/api/pedido/{id_sandwich}")
    Call<Order> addOrder(@Path("id_sandwich") int snackId, @Body JsonArray extras);

}
