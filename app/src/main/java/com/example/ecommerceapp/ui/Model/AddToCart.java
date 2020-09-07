package com.example.ecommerceapp.ui.Model;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ecommerceapp.AboutUsActivity;
import com.example.ecommerceapp.EcommerceMain;
import com.example.ecommerceapp.NavActivity;
import com.example.ecommerceapp.Payment;
import com.example.ecommerceapp.R;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;


public class AddToCart extends AppCompatActivity
{
    RecyclerView recview;
    cartAdapter adapter;
    Button btnNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

        getSupportActionBar().setTitle("Shopping Cart");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnNext=(Button) findViewById(R.id.next_process_btn);

        recview=(RecyclerView)findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<model> options =
                new FirebaseRecyclerOptions.Builder<model>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Product"), model.class)
                        .build();

        adapter=new cartAdapter(options);
        recview.setAdapter(adapter);

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AddToCart.this, Payment.class));
            }
        });


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











// holder.itemView.setOnClickListener(new View.OnClickListener() {
//@Override
//public void onClick(View view) {
//        CharSequence options[] = new CharSequence[]
//        {
//        "Remove","Edit"
//        };
//        AlertDialog.Builder builder = new AlertDialog.Builder(AddToCart.this);
//        builder.setTitle("Cart Option:");
//
//        builder.setItems(options, new DialogInterface.OnClickListener() {
//@Override
//public void onClick(DialogInterface dialogInterface, int i) {
//
//        }
//        })
//
//        }
//        });