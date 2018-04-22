package id.dilo.raga.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import id.dilo.raga.model.DataMerchandise;
import id.dilo.raga.R;

/**
 * Created by TRW on 3/10/2018.
 */

public class RecyclerviewMerchandise extends RecyclerView.Adapter<RecyclerviewMerchandise.ContactViewHolder> {
    private Context context;
    private List<DataMerchandise> dataMerchandise;


    public RecyclerviewMerchandise(Context context, List<DataMerchandise> dataMerchandise) {
        this.context = context;
        this.dataMerchandise = dataMerchandise;
    }


    @Override
    public ContactViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view;
        LayoutInflater mInflater = LayoutInflater.from(context);
        view = mInflater.inflate(R.layout.list_merchandise,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ContactViewHolder holder, int position) {

       holder.imgMerchandise.setImageResource(dataMerchandise.get(position).getImg_merchandise());
       holder.namaMerchandise.setText(dataMerchandise.get(position).getNama_merchandise());
       holder.harga.setText(dataMerchandise.get(position).getHarga());
    }

    @Override
    public int getItemCount() {
        return dataMerchandise.size();
    }

    public static class  ContactViewHolder extends RecyclerView.ViewHolder {

        ImageView imgMerchandise;
        TextView namaMerchandise, harga;
        CardView cardViewMerchandise;

        public ContactViewHolder(View itemView) {
            super(itemView);
            imgMerchandise =itemView.findViewById(R.id.imgMerchandise);
            namaMerchandise =itemView.findViewById(R.id.textMerchandise);
            harga =itemView.findViewById(R.id.textHarga);
            cardViewMerchandise =itemView.findViewById(R.id.cardViewMerchandise);
        }
    }

}
