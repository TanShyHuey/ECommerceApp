package com.example.ecommerceapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class ComesticPagesJava extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comesticpages);


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

    public void gotoLipstick(View view) {
        Intent intent = new Intent(this, Comestic4.class);
        startActivity(intent);
    }

    public void gotoComestic1(View view) {
        Intent intent = new Intent(this, Comestic1.class);
        startActivity(intent);
    }

    public void gotoComestic3(View view) {
        Intent intent = new Intent(this, Comestic3.class);
        startActivity(intent);
    }

    public void gotoComestic4(View view) {
        Intent intent = new Intent(this, Comestic2.class);
        startActivity(intent);
    }

    public void gotoComestic5(View view) {
        Intent intent = new Intent(this, Comestic5.class);
        startActivity(intent);
    }

    public void gotoComestic6(View view) {
        Intent intent = new Intent(this, Comestic6.class);
        startActivity(intent);
    }
}
