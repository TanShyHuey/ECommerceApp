package com.example.ecommerceapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
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
    FirebaseAuth auth;
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


        btnConOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                database = FirebaseDatabase.getInstance();
                reference = database.getReference("Payment Detail");
                final String pname = name.getText().toString();
                final String pphone = phone.getText().toString();
                final String pemail = email.getText().toString();
                final String paddress = address.getText().toString();
                final String pnotes = notes.getText().toString();


                PayDetail payDetail = new PayDetail(pname,pphone,pemail,paddress,pnotes);
                reference.child(pname).setValue(payDetail);
                if(TextUtils.isEmpty(pname)){
                    name.setError("Enter your your name pls!");
                    return;
                }
                if(TextUtils.isEmpty(paddress)){
                    Toast.makeText(getApplicationContext(), "Enter your address pls!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(pemail)){
                    Toast.makeText(getApplicationContext(), "Enter your email pls!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(pphone)){
                    Toast.makeText(getApplicationContext(), "Enter your phone number pls!", Toast.LENGTH_SHORT).show();
                    return;
                }

                Toast.makeText(getApplicationContext(), "Payment done!", Toast.LENGTH_SHORT).show();

                Task<Void> task = reference.child("Product").removeValue();

                task.addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {

                            }
                        });


                startActivity(new Intent(Payment.this, NavActivity.class));
                finish();


            }
        });

    }


}