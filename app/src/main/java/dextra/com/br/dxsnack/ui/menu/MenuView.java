package dextra.com.br.dxsnack.ui.menu;

import java.util.List;

import dextra.com.br.dxsnack.model.Snack;

public interface MenuView {
    void loadSnacks(List<Snack> snacks);
    void showLoading();
    void hideLoading();
}
