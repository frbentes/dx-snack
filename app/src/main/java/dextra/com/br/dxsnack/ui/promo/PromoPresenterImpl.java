package dextra.com.br.dxsnack.ui.promo;

import android.content.Context;

import javax.inject.Inject;

import dextra.com.br.dxsnack.app.DxSnackApplication;
import dextra.com.br.dxsnack.network.DxApi;

public class PromoPresenterImpl implements PromoPresenter {

    @Inject
    DxApi dxApi;

    private PromoView view;

    public PromoPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

    @Override
    public void setView(PromoView view) {
        this.view = view;
    }

    @Override
    public void getPromos() {

    }

}
