package dextra.com.br.dxsnack.ui.promo;

import android.content.Context;

import dextra.com.br.dxsnack.app.DxSnackApplication;

public class PromoPresenterImpl implements PromoPresenter {

    public PromoPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

}
