package dextra.com.br.dxsnack.ui.menu;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import dextra.com.br.dxsnack.R;
import dextra.com.br.dxsnack.model.Snack;
import dextra.com.br.dxsnack.ui.snack.SnackActivity;

public class MenuAdapter extends RecyclerView.Adapter<MenuViewHolder> {

    private List<Snack> snacks = new ArrayList<>();
    private Context context;

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        final Snack snack = this.snacks.get(position);
        holder.tvName.setText(snack.getName());
        holder.tvIngredients.setText("teste");
        holder.tvPrice.setText("R$ 99,99");

        Glide.with(context)
                .load(snack.getImageUrl())
                .placeholder(R.drawable.no_image)
                .error(R.drawable.no_image)
                .crossFade()
                .into(holder.ivPhoto);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, SnackActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return snacks.size();
    }

    @Override
    public void onViewRecycled(MenuViewHolder holder) {
        super.onViewRecycled(holder);
        Glide.clear(holder.ivPhoto);
    }

    public void setData(List<Snack> items) {
        this.snacks = items;
    }

}
