package dextra.com.br.dxsnack.ui.cart;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import dextra.com.br.dxsnack.R;

public class CartViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public TextView tvDate;
    public TextView tvPrice;

    public CartViewHolder(View view) {
        super(view);

        this.tvName = (TextView) view.findViewById(R.id.tv_order_name);
        this.tvDate = (TextView) view.findViewById(R.id.tv_order_date);
        this.tvPrice = (TextView) view.findViewById(R.id.tv_order_price);
    }

}
