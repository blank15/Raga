package id.dilo.raga.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import id.dilo.raga.R;

/**
 * Created by blank15 on 12/04/2018.
 */

public class RecyclerViewListSport extends RecyclerView.Adapter<RecyclerViewListSport.ViewHolder> {

    Context context;

    public RecyclerViewListSport(Context context) {
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new RecyclerViewListSport.ViewHolder(LayoutInflater.from(context).inflate(R.layout.list_sport,parent,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 8;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
