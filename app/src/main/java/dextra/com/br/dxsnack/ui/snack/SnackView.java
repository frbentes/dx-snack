package dextra.com.br.dxsnack.ui.snack;

import dextra.com.br.dxsnack.model.Snack;

public interface SnackView {
    void loadSnack(Snack snack);
    void showLoading();
    void hideLoading();
}
