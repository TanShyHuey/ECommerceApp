package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class BagsPagesJava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bagspages);


    }

    public void gotoBag(View view) {
        Intent intent = new Intent(this, Bag1.class);
        startActivity(intent);
    }

    public void gotobag2(View view) {
        Intent intent = new Intent(this, Bag2.class);
        startActivity(intent);
    }

    public void gotoBag3(View view) {
        Intent intent = new Intent(this, Bag3.class);
        startActivity(intent);
    }

    public void gotoBag4(View view) {
        Intent intent = new Intent(this, Bag4.class);
        startActivity(intent);
    }

    public void gotoBag5(View view) {
        Intent intent = new Intent(this, Bag5.class);
        startActivity(intent);
    }

    public void gotoBag6(View view) {
        Intent intent = new Intent(this, Bag6.class);
        startActivity(intent);
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
}

