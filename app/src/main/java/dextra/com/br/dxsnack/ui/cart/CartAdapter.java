package dextra.com.br.dxsnack.ui.cart;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.model.Order;
import dextra.com.br.dxsnack.model.Promo;

public class CartAdapter extends RecyclerView.Adapter<CartViewHolder> {

    private List<Order> orders = new ArrayList<>();

    @Override
    public CartViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_order, parent, false);
        return new CartViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CartViewHolder holder, int position) {
        final Order order = this.orders.get(position);
        //holder.tvName.setText(order.get);
        holder.tvDate.setText(order.getDate());
        //holder.tvPrice.setText(order.)
    }

    @Override
    public int getItemCount() {
        return orders.size();
    }

    public void setData(List<Order> items) {
        this.orders = items;
    }

}
