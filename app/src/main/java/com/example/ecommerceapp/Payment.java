package com.example.ecommerceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Payment extends AppCompatActivity {

    EditText name, address,email, phone, notes;
    Button btnConOrder;
    PayDetail payDetail;
    FirebaseDatabase database;
    DatabaseReference reference;
    long maxed =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        name = (EditText) findViewById(R.id.editName);
        address = (EditText) findViewById(R.id.editAddress);
        email = (EditText) findViewById(R.id.editEmail);
        phone = (EditText) findViewById(R.id.editPhone);
        notes = (EditText) findViewById(R.id.editNote);
        btnConOrder = (Button) findViewById(R.id.btnConfirmOrder);
        payDetail=new PayDetail();
        reference = FirebaseDatabase.getInstance(). getReference(). child("PayDetail");
        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if(dataSnapshot.exists())
                    maxed =(dataSnapshot.getChildrenCount());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        final String Name = name.getText().toString();
        final String Address = address.getText().toString();
        final String Email = email.getText().toString();
        final String Phone = phone.getText().toString();

        btnConOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(TextUtils.isEmpty(Name)){
                    Toast.makeText(getApplicationContext(), "Enter your name pls!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Address)){
                    Toast.makeText(getApplicationContext(), "Enter your address pls!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Email)){
                    Toast.makeText(getApplicationContext(), "Enter your email pls!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(Phone)){
                    Toast.makeText(getApplicationContext(), "Enter your phone number pls!", Toast.LENGTH_SHORT).show();
                    return;
                }
                else {
                    reference.child(String.valueOf(maxed +1)).setValue(payDetail);
                    Toast.makeText(getApplicationContext(), "Payment done!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}