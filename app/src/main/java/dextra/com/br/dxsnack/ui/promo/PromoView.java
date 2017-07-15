package dextra.com.br.dxsnack.ui.promo;

import java.util.List;

import dextra.com.br.dxsnack.model.Promo;

public interface PromoView {
    void loadPromos(List<Promo> promos);
    void showLoading();
    void hideLoading();
}
