package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class NavActivity extends AppCompatActivity {

    private TextView tvLogout,tvAbout,tvContact;
    private ImageView profile ;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        tvLogout = (TextView) findViewById(R.id.aalogout);
        tvAbout=(TextView)findViewById(R.id.about);
        tvContact=(TextView)findViewById(R.id.contact);
        profile=(ImageView)findViewById(R.id.imageView7);

        mAuth = FirebaseAuth.getInstance();

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this, LoginActivity.class));
                mAuth.signOut();
            }
        });

        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavActivity.this, AboutUsActivity.class));
            }
        });

        tvContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavActivity.this, SendEmail.class));
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavActivity.this, UserProfile.class));
            }
        });
    }


    public void gotocarrierlist(View view) {
        Intent intent = new Intent(this, CarrierList.class);
        startActivity(intent);
    }
}