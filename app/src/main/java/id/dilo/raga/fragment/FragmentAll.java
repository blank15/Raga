package id.dilo.raga.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import id.dilo.raga.R;
import id.dilo.raga.adapter.RecyclerviewMerchandise;
import id.dilo.raga.model.DataMerchandise;

/**
 * Created by joedhaalzelvin on 11/04/18.
 */

public class FragmentAll extends Fragment {

    List<DataMerchandise> dataMerchandise = new ArrayList<>();
    RecyclerView recyclerView;
    Context context;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=LayoutInflater.from(getContext()).inflate(R.layout.fragment_all, container, false);
        recyclerView = view.findViewById(R.id.rvAll);

        dataMerchandise = new ArrayList<>();
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "Chelsea","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "Juventus","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.sepatu, "Barcelona","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_aksesoris, "Real Madrid","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_aksesoris2, "Real Madrid","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "Inter Milan","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "PSG","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_aksesoris, "Chelsea","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.sepatu, "Juventus","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_aksesoris, "Barcelona","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.sepatu, "Real Madrid","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "Inter Milan","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "PSG","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "Inter Milan","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "PSG","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "Chelsea","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "Juventus","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_kaos, "Barcelona","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "Real Madrid","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.sepatu, "Inter Milan","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "PSG","Rp. 250.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_aksesoris, "Chelsea","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_aksesoris2, "Juventus","Rp. 150.000"));
        dataMerchandise.add(new DataMerchandise(R.drawable.ic_celana, "Barcelona","Rp. 250.000"));


        RecyclerviewMerchandise Myrecyclear = new RecyclerviewMerchandise(getContext(),dataMerchandise);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setLayoutManager(new GridLayoutManager(context,2));
        recyclerView.setAdapter(Myrecyclear);
        Myrecyclear.notifyDataSetChanged();
        return view;
    }
}
