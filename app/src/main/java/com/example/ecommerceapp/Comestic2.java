package com.example.ecommerceapp;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;



public class Comestic2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Button addToCartButton;
    private TextView productName,productPrice;
    private ElegantNumberButton btn;
    private Spinner ShippingList;
    private Spinner ProductColor;
    private TextView productCarrierList;

    private Button btnFavouriteProduct;
    private TextView FavproductName,FavproductPrice;
    private ElegantNumberButton Favbtn;
    private Spinner FavShippingList;
    private Spinner FavProductColor;

    DatabaseReference Item;
    product product;
    Favmodel favourite;
    DatabaseReference Referenced;


    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comesticitem1);

        getSupportActionBar().setTitle("No Limits");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        productName=(TextView) findViewById(R.id.ProductNamec1);
        productPrice=(TextView) findViewById(R.id.ProductPricec1);
        addToCartButton=(Button) findViewById(R.id.pd_add_to_cart_buttonc1);
        btn = (ElegantNumberButton) findViewById(R.id.Quantityc1);
        ShippingList=(Spinner)findViewById(R.id.Shippingc1);
        ProductColor=(Spinner) findViewById(R.id.Colorc1);
        btnFavouriteProduct=(Button) findViewById(R.id.Favourite_buttonc1);

        product=new product();
        Item=FirebaseDatabase.getInstance().getReference().child("Product");


        addToCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                product.setProductName(productName.getText().toString().trim());
                product.setProductPrice(productPrice.getText().toString().trim());
                product.setShipping(ShippingList.getSelectedItem().toString());
                product.setQuantity(btn.getNumber());
                product.setColor(ProductColor.getSelectedItem().toString());
                Item.push().setValue(product);
                Toast.makeText(Comestic2.this,"add to cart Successful",Toast.LENGTH_LONG).show();
            }

        });

        btn.setOnClickListener(new ElegantNumberButton.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = btn.getNumber();
                Log.e("Num", num);


            }
        });

        Spinner spinner = findViewById(R.id.Shippingc1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.carrierlist,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        spinner = findViewById(R.id.Colorc1);
        adapter = ArrayAdapter.createFromResource(this, R.array.colorlist, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        favourite =new Favmodel();
        Referenced = FirebaseDatabase.getInstance().getReference().child("Favorite");

        FavproductName=(TextView) findViewById(R.id.ProductNamec1);
        FavproductPrice=(TextView) findViewById(R.id.ProductPricec1);
        Favbtn = (ElegantNumberButton) findViewById(R.id.Quantityc1);
        FavShippingList=(Spinner)findViewById(R.id.Shippingc1);
        btnFavouriteProduct=(Button) findViewById(R.id.Favourite_buttonc1);

        btnFavouriteProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                favourite.setName(FavproductName.getText().toString().trim());
                favourite.setPrices(FavproductPrice.getText().toString().trim());

                Referenced.push().setValue(favourite);
                Toast.makeText(Comestic2.this,"add to Favorite Successful",Toast.LENGTH_LONG).show();
            }
        });






    }


    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void setProductCarrierList(TextView productCarrierList) {
        this.productCarrierList = productCarrierList;
    }
}