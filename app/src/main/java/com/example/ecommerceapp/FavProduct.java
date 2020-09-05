package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class FavProduct extends AppCompatActivity {
    RecyclerView recyclerView;
    FavoriteAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fav_product);


        getSupportActionBar().setTitle("Favorite List");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        recyclerView =(RecyclerView)findViewById(R.id.recview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<Favorite_model> options =
                new FirebaseRecyclerOptions.Builder<Favorite_model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Product"), Favorite_model.class)
                        .build();

        adapter=new FavoriteAdapter(options);
        recyclerView.setAdapter(adapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.startListening();
    }

}