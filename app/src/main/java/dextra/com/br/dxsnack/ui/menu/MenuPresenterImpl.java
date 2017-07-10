package dextra.com.br.dxsnack.ui.menu;

import android.content.Context;

import dextra.com.br.dxsnack.app.DxSnackApplication;

public class MenuPresenterImpl implements MenuPresenter {

    public MenuPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

}
