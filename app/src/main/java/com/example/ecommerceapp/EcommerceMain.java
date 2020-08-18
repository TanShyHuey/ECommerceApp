package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class EcommerceMain extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.productmainpages);
    }

    public void gotoShoes1(View view) {
        Intent intent = new Intent(this, Shoes1.class);
        startActivity(intent);
    }

    public void gotocomestic2(View view) {
        Intent intent = new Intent(this, Comestic2.class);
        startActivity(intent);
    }

    public void gotoBag1(View view) {
        Intent intent = new Intent(this, Bag1.class);
        startActivity(intent);
    }

    public void gotoLipstick(View view) {
        Intent intent = new Intent(this, Lipstick.class);
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

    public void gotoBagsPages(View view) {
        Intent intent = new Intent(this, BagsPagesJava.class);
        startActivity(intent);
    }
}