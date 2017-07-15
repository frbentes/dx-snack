package dextra.com.br.dxsnack.ui.menu;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dextra.com.br.dxsnack.R;

public class MenuViewHolder extends RecyclerView.ViewHolder {

    public ImageView ivPhoto;
    public TextView tvName;
    public TextView tvIngredients;
    public TextView tvPrice;

    public MenuViewHolder(View view) {
        super(view);

        this.ivPhoto = (ImageView) view.findViewById(R.id.iv_snack_photo);
        this.tvName = (TextView) view.findViewById(R.id.tv_snack_name);
        this.tvIngredients = (TextView) view.findViewById(R.id.tv_snack_ingredients);
        this.tvPrice = (TextView) view.findViewById(R.id.tv_snack_price);
    }

}
