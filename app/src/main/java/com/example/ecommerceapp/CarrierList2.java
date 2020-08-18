package com.example.ecommerceapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class CarrierList2 extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrierlist2);

    }

    public void gotoactivity4(View view) {
        Intent intent = new Intent(this, CarrierList2.class);
        startActivity(intent);
    }

    public void gotoactivity3(View view) {
        Intent intent = new Intent(this, CarrierList.class);
        startActivity(intent);
    }

    public void goback2(View view) {
        startActivity(new Intent(this, CarrierList.class));
    }


    public void Info9(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.gdexpress.com/malaysia/home/"));
        startActivity(intent);
    }

    public void Info10(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("http://www.skynet.com.my/"));
        startActivity(intent);
    }

    public void Info11(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://centuryexpress.me/track-shipment/"));
        startActivity(intent);
    }

    public void Info12(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.citylinkexpress.com/MY/Home.aspx"));
        startActivity(intent);
    }

    public void Info13(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.tracking.my/jt"));
        startActivity(intent);
    }

    public void Info14(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.tnt.com/express/en_my/site/home.html?gclid=EAIaIQobChMIjc36z5OT6wIVjTUrCh1-2wcnEAAYASAAEgJmnfD_BwE"));
        startActivity(intent);
    }

    public void Info15(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.ninjaxpress.co/"));
        startActivity(intent);
    }

    public void Info16(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://goget.my/"));
        startActivity(intent);
    }
}
