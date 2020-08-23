package com.example.ecommerceapp;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class FavouriteList extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wishlist);

    }

    public void gotoHome(View view) {
        Intent intent = new Intent(this, EcommerceMain.class);
        startActivity(intent);
    }

    public void gotoNav(View view) {
        Intent intent = new Intent(this, NavActivity.class);
        startActivity(intent);
    }

    public void gotoCart(View view) {
        Intent intent = new Intent(this, CartList.class);
        startActivity(intent);
    }
}
