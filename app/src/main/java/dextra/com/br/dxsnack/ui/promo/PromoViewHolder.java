package dextra.com.br.dxsnack.ui.promo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import dextra.com.br.dxsnack.R;

public class PromoViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public TextView tvDescription;

    public PromoViewHolder(View view) {
        super(view);

        this.tvName = (TextView) view.findViewById(R.id.tv_promo_name);
        this.tvDescription = (TextView) view.findViewById(R.id.tv_promo_description);
    }

}
