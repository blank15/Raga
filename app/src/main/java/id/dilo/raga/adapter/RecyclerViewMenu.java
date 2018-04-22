package id.dilo.raga.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import id.dilo.raga.R;
import id.dilo.raga.fragment.MerchandiseActivity;
import id.dilo.raga.model.MenuModel;
import id.dilo.raga.view.SportActivity;

/**
 * Created by blank15 on 12/04/2018.
 */

public class RecyclerViewMenu extends RecyclerView.Adapter<RecyclerViewMenu.ViewHolder> {

    Context context;
    List<MenuModel> menuModels;

    public RecyclerViewMenu(Context context, List<MenuModel> menuModels) {
        this.context = context;
        this.menuModels = menuModels;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewMenu.ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_menu,parent,false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {
        holder.imagehome.setImageResource(menuModels.get(position).getImageHome());
        holder.textViewTitle.setText(menuModels.get(position).getMenuTitle());
        holder.cardViewMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(menuModels.get(position).getMenuTitle().equals("Sport")){
                    Intent intent = new Intent(context, SportActivity.class);
                    context.startActivity(intent);
                }
                else if(menuModels.get(position).getMenuTitle().equals("Merchandise")){
                    Intent intent = new Intent(context, MerchandiseActivity.class);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return menuModels.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewTitle;
        ImageView imagehome;
        CardView cardViewMenu;
        public ViewHolder(View itemView) {
            super(itemView);
            imagehome = itemView.findViewById(R.id.imagehome);
            textViewTitle = itemView.findViewById(R.id.textTitle);
            cardViewMenu = itemView.findViewById(R.id.cardView);
        }
    }
}
