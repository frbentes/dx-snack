package dextra.com.br.dxsnack.ui.promo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.model.Promo;

public class PromoAdapter extends RecyclerView.Adapter<PromoViewHolder> {

    private List<Promo> promos = new ArrayList<>();

    @Override
    public PromoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_promo, parent, false);
        return new PromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(PromoViewHolder holder, int position) {
        final Promo promo = this.promos.get(position);
        holder.tvName.setText(promo.getName());
        holder.tvDescription.setText(promo.getDescription());
    }

    @Override
    public int getItemCount() {
        return promos.size();
    }

    public void setData(List<Promo> items) {
        this.promos = items;
    }

}
