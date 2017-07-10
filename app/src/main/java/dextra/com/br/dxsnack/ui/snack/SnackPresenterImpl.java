package dextra.com.br.dxsnack.ui.snack;

import android.content.Context;

import dextra.com.br.dxsnack.app.DxSnackApplication;

public class SnackPresenterImpl implements SnackPresenter {

    public SnackPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

}
