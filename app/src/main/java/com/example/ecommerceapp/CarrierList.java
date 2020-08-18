package com.example.ecommerceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;



public class CarrierList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrierlist);


    }


    public void gotoactivity2(View view) {
        Intent intent = new Intent(this, CarrierList2.class);
        startActivity(intent);
    }

    public void gotoactivity1(View view) {
        Intent intent = new Intent(this, CarrierList.class);
        startActivity(intent);
    }


    public void goback(View view) {

        startActivity(new Intent(this, NavActivity.class));
    }


    public void gotoec(View view) {
        Intent intent = new Intent(this, EcommerceMain.class);
        startActivity(intent);
    }

    public void Info1(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.cttexpress.com/home/index"));
        startActivity(intent);
    }

    public void Info2(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.brt.it/en/home"));
        startActivity(intent);
    }

    public void Info3(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://iml.ru/"));
        startActivity(intent);
    }

    public void Info4(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.postaplus.com/"));
        startActivity(intent);
    }

    public void Info5(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://track24.net/service/sda/tracking/"));
        startActivity(intent);
    }

    public void Info6(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://ecomexpress.in/"));
        startActivity(intent);
    }



    public void Info8(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.delhivery.com/"));
        startActivity(intent);
    }
}