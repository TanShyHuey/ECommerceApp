package com.example.ecommerceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ecommerceapp.ui.Feedback.FeedbackActivity;
import com.example.ecommerceapp.ui.Model.AddToCart;
import com.google.firebase.auth.FirebaseAuth;

public class NavActivity extends AppCompatActivity {

    private TextView tvLogout,tvAbout,tvhistorypayment ;
    private ImageView profile ,message,chat,feedback;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);

        tvLogout = (TextView) findViewById(R.id.aalogout);
        tvAbout=(TextView)findViewById(R.id.about);
        tvhistorypayment=(TextView)findViewById(R.id.historypayment);
        profile=(ImageView)findViewById(R.id.imageView7);
        message=(ImageView)findViewById(R.id.imageViewmessage);
        chat=(ImageView)findViewById(R.id.imageViewchat);
        feedback =(ImageView)findViewById(R.id.imageViewFeedback);
        mAuth = FirebaseAuth.getInstance();

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this, LoginActivity.class));
                mAuth.signOut();
            }
        });

        tvLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this, LoginActivity.class));
                mAuth.signOut();
            }
        });
        chat .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this, ChatActivity.class));
            }
        });
        message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this, SendEmail.class));
            }
        });
        feedback .setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NavActivity.this, FeedbackActivity.class));
            }
        });

        tvAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavActivity.this, AboutUsActivity.class));
            }
        });

        tvhistorypayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(NavActivity.this,HistoryPayment.class));
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

    public void gotoproductpages(View view) {
        Intent intent = new Intent(this, EcommerceMain.class);
        startActivity(intent);
    }
}