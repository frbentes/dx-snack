package dextra.com.br.dxsnack.ui.cart;

import android.content.Context;

import javax.inject.Inject;

import dextra.com.br.dxsnack.app.DxSnackApplication;
import dextra.com.br.dxsnack.network.DxApi;

public class CartPresenterImpl implements CartPresenter {

    @Inject
    DxApi dxApi;

    private CartView view;


    public CartPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

    @Override
    public void setView(CartView view) {
        this.view = view;
    }

    @Override
    public void getOrders() {

    }

}
