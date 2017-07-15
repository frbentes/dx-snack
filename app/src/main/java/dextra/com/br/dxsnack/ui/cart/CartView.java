package dextra.com.br.dxsnack.ui.cart;

import java.util.List;

import dextra.com.br.dxsnack.model.Order;

public interface CartView {
    void loadOrders(List<Order> orders);
    void showLoading();
    void hideLoading();
}
