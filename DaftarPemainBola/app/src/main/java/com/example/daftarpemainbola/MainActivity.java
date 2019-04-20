package com.example.daftarpemainbola;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Bola> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(BolaData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        ListBolaAdapter listBolaAdapter = new ListBolaAdapter(this);
        listBolaAdapter.setListBola(list);
        rvCategory.setAdapter(listBolaAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedBola(list.get(position));
            }
        });
    }

    private void showSelectedBola(Bola bola){
        Toast.makeText(this, "Kamu memilih "+bola.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
        intent.putExtra("image_url", bola.getPhoto());
        intent.putExtra("image_name", bola.getName());
        intent.putExtra("image_description", bola.getDescription());
        startActivity(intent);
    }

    private void showRecyclerGrid(){
        rvCategory.setLayoutManager(new GridLayoutManager(this, 2));
        GridBolaAdapter gridBolaAdapter = new GridBolaAdapter(this);
        gridBolaAdapter.setListBola(list);
        rvCategory.setAdapter(gridBolaAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedBola(list.get(position));
            }
        });
    }

    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewBolaAdapter cardViewBolaAdapter = new CardViewBolaAdapter(this);
        cardViewBolaAdapter.setListBola(list);
        rvCategory.setAdapter(cardViewBolaAdapter);
        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                showSelectedBola(list.get(position));
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_list:
                showRecyclerList();
                break;
            case R.id.action_grid:
                showRecyclerGrid();
                break;
            case R.id.action_cardview:
                showRecyclerCardView();
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}