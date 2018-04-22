package id.dilo.raga.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import id.dilo.raga.R;
import id.dilo.raga.adapter.RecyclerViewListSport;

public class SportActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarSport);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Sport");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = findViewById(R.id.rview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewListSport adapter = new RecyclerViewListSport(this);
        recyclerView.setAdapter(adapter);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();

    }
}
