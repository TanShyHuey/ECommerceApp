package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class FavoriteProduct extends AppCompatActivity
{
    RecyclerView favrecview;
    FavAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_product);

        favrecview=(RecyclerView)findViewById(R.id.favoritep);
        favrecview.setHasFixedSize(false);
        favrecview.setLayoutManager(new LinearLayoutManager(this));


        FirebaseRecyclerOptions<Favmodel>options=
                new FirebaseRecyclerOptions.Builder<Favmodel>()
                     .setQuery(FirebaseDatabase.getInstance().getReference().child("Favorite"),Favmodel.class)
                     .build();

        adapter=new FavAdapter(options);
        favrecview.setAdapter(adapter);
    }
        @Override
        protected void onStart() {
            super.onStart();
            adapter.startListening();
        }

        @Override
         protected void onStop() {
            super.onStop();
            adapter.stopListening();
        }

}