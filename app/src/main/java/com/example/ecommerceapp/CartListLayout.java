package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceapp.R;

public class CartListLayout extends AppCompatActivity {

    private TextView productName, productPrice;
    private TextView Quantity;
    private int mCount = 0;
    private ImageButton btnAdd, btnRemove;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list_layout);

        Quantity = (TextView) findViewById(R.id.product_quantity);
        productName = (TextView) findViewById(R.id.product_name);
        productPrice = (TextView) findViewById(R.id.product_price);

        btnAdd = (ImageButton) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ++mCount;
                Quantity.setText(Integer.toString(mCount));
            }
        });

        btnRemove = (ImageButton) findViewById(R.id.btnRemove);
        btnRemove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --mCount;
                Quantity.setText(Integer.toString(mCount));
            }
        });
    }
}