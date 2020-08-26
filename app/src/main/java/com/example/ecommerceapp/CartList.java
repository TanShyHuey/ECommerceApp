package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.ecommerceapp.ui.Model.cart;
import com.example.ecommerceapp.ui.Model.cartAdapter;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class CartList extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;

    private Button NextProcessBtn;
    private TextView txtTotalAmount;
    private FirebaseAuth Auth;
    private DatabaseReference reff;
    private StorageReference storageReference;

    private ViewGroup Parent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart_list);

        Auth = FirebaseAuth.getInstance();
        reff = FirebaseDatabase.getInstance().getReference().child("Product").child(Auth.getCurrentUser().getUid());
        reff.keepSynced(true);


        recyclerView = (RecyclerView)findViewById(R.id.cart_list);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        storageReference = FirebaseStorage.getInstance().getReference();

        NextProcessBtn = (Button) findViewById(R.id.next_process_btn);
        txtTotalAmount = (TextView) findViewById(R.id.total_price);

        //FirebaseRecyclerOptions<Payment> options = new FirebaseRecyclerOptions.Builder<cart>().setQuery(reff, cart.class).build();

        //RecyclerView.Adapter adapter = new cartAdapter(options);
        //recyclerView.setAdapter(adapter);


    }

}