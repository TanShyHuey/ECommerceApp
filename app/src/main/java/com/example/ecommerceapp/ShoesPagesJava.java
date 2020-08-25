package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ShoesPagesJava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoespages);

        getSupportActionBar().setTitle("Shoes");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void gotoBagsPages(View view) {
        Intent intent = new Intent(this, BagsPagesJava.class);
        startActivity(intent);
    }

    public void gotoComesticPages(View view) {
        Intent intent = new Intent(this, ComesticPagesJava.class);
        startActivity(intent);
    }

    
    public void gotoShoesPages(View view) {
        Intent intent = new Intent(this, ShoesPagesJava.class);
        startActivity(intent);
    }

    public void gotoShoes1(View view) {
        Intent intent = new Intent(this, Shoes1.class);
        startActivity(intent);
    }

    public void gotoShoes2(View view) {
        Intent intent = new Intent(this, Shoes2.class);
        startActivity(intent);
    }

    public void gotoShoes3(View view) {
        Intent intent = new Intent(this, Shoes3.class);
        startActivity(intent);
    }

    public void gotoShoes4(View view) {
        Intent intent = new Intent(this, Shoes4.class);
        startActivity(intent);
    }

    public void gotoShoes5(View view) {
        Intent intent = new Intent(this, Shoes5.class);
        startActivity(intent);
    }

    public void gotoShoes6(View view) {
        Intent intent = new Intent(this, Shoes6.class);
        startActivity(intent);
    }
}
