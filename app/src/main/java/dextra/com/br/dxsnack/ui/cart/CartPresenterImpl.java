package dextra.com.br.dxsnack.ui.cart;

import android.content.Context;

import dextra.com.br.dxsnack.app.DxSnackApplication;

public class CartPresenterImpl implements CartPresenter {

    public CartPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

}
