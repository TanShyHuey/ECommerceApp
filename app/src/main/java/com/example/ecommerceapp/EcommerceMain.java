package com.example.ecommerceapp;


import android.content.Intent;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.ecommerceapp.ui.Model.AddToCart;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EcommerceMain extends AppCompatActivity {

    ViewFlipper v_flipper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_item_main);



        getSupportActionBar().setTitle("No Limits");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

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
        BottomNavigationView bottomNavigationView=findViewById(R.id.bottom_navigation);

        bottomNavigationView.setSelectedItemId(R.id.deals);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.deals:
                        return true;
                    case R.id.addtocart:
                        startActivity(new Intent(getApplicationContext(),AddToCart.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.myaccount:
                        startActivity(new Intent(getApplicationContext(),NavActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }

                return false;
            }
        });


    }



    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(3000); //3sec
        v_flipper.setAutoStart(true);

        //animation

        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);
    }


    public void gotoShoes1(View view) {
        Intent intent = new Intent(this, Shoes1.class);
        startActivity(intent);
    }


    public void gotoBag1(View view) {
        Intent intent = new Intent(this, Bag1.class);
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

    public void gotoComestic7(View view) {
        Intent intent = new Intent(this, Comestic2.class);
        startActivity(intent);
    }

    public void gotolipstick(View view) {
        Intent intent = new Intent(this, Comestic4.class);
        startActivity(intent);
    }

    public void gotoCartList(View view) {
        Intent intent = new Intent(this, AddToCart.class);
        startActivity(intent);

    }


    public void gotoNewArrivals(View view) {
        Intent intent = new Intent(this, Shoes7.class);
        startActivity(intent);
    }
    public void gotoBag5(View view) {
        Intent intent = new Intent(this, Bag5.class);
        startActivity(intent);
    }
    public void gotoComestic6(View view) {
        Intent intent = new Intent(this, Comestic4.class);
        startActivity(intent);
    }

    public void gotoFavoriteProduct(View view) {
        Intent intent =new Intent(this,FavoriteProduct.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){


        int id =item.getItemId();


        if(id== R.id.navigation_carrierlist){
            Intent myintent=new Intent(EcommerceMain.this,CarrierList.class);
            startActivity(myintent);
            return false;
        }
        if(id==R.id.navigation_cartlist){
            Intent myintent=new Intent(EcommerceMain.this,AddToCart.class);
            startActivity(myintent);
            return false;

        }
        if(id==R.id.navigation_favoritelist){
            Intent myintent=new Intent(EcommerceMain.this,FavoriteProduct.class);
            startActivity(myintent);
            return false;

        }
        
       return super.onOptionsItemSelected(item);

    }
}