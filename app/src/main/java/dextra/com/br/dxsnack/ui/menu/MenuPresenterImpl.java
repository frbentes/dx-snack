package dextra.com.br.dxsnack.ui.menu;

import android.content.Context;

import javax.inject.Inject;

import dextra.com.br.dxsnack.app.DxSnackApplication;
import dextra.com.br.dxsnack.network.DxApi;

public class MenuPresenterImpl implements MenuPresenter {

    @Inject
    DxApi dxApi;

    private MenuView view;

    public MenuPresenterImpl(Context context) {
        ((DxSnackApplication) context).getAppComponent().inject(this);
    }

    @Override
    public void setView(MenuView view) {
        this.view = view;
    }

    @Override
    public void getSnacks() {

    }

}
