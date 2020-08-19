package com.example.ecommerceapp;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;


public class Shoes4 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Button addToCartButton;
    private ImageView productImage;
    private TextView productPrice,productName,productCarrierList;
    private ElegantNumberButton btn;




    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shoesitem4);


        productImage=(ImageView) findViewById(R.id.product_image_details);
        productName=(TextView) findViewById(R.id.product_name_details);
        productPrice=(TextView) findViewById(R.id.product_image_price);
        addToCartButton=(Button) findViewById(R.id.pd_add_to_cart_button);
        btn = (ElegantNumberButton) findViewById(R.id.myButton);


        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                addingToCartList();
            }
        });

        btn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = btn.getNumber();
                Log.e("Num", num);
            }
        });

        Spinner spinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.carrierlist,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        spinner = findViewById(R.id.spinner2);
        adapter = ArrayAdapter.createFromResource(this, R.array.sizelist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



    }

    private void addingToCartList()
    {
        String saveCurrentTime,saveCurrentDate;
        Calendar calForDate= Calendar.getInstance();
        SimpleDateFormat currentDate=new SimpleDateFormat("MM.dd,yyyy");
        saveCurrentDate=currentDate.format(calForDate.getTime());
        SimpleDateFormat currentTime=new SimpleDateFormat("HH:mm:ss a");
        saveCurrentTime=currentDate.format(calForDate.getTime());

        DatabaseReference cartListRef= FirebaseDatabase.getInstance().getReference().child("Product");

        final HashMap<String,Object>cartMap=new HashMap<>();
        cartMap.put("pid",productName.getText().toString());
        cartMap.put("pImage",productImage);
        cartMap.put("Price",productPrice.getText().toString());
        cartMap.put("Quantity",btn.getNumber());
        cartMap.put("time",saveCurrentTime);
        cartMap.put("date",saveCurrentDate);
        cartMap.put("CarrierList",productCarrierList);




    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}