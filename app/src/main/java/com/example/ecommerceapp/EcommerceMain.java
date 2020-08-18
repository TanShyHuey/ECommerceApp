package com.example.ecommerceapp;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.appcompat.app.AppCompatActivity;

public class EcommerceMain extends AppCompatActivity {

    ViewFlipper v_flipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_item_main);

        int images[]={R.drawable.slide1,R.drawable.slide2,R.drawable.slide4};

        v_flipper =findViewById(R.id.v_flipper);

        //for loop

        //for(int i=0;i<image.length; i++){
        //    flipperImages(image[i]);
        // }

        //but i prefer foreach
        for (int image: images){
            flipperImages(image);
        }

    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000); //4sec
        v_flipper.setAutoStart(true);

        //animation

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
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