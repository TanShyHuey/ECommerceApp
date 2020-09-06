package com.example.ecommerceapp.ui.Feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ecommerceapp.MessageClass;
import com.example.ecommerceapp.NavActivity;
import com.example.ecommerceapp.Payment;
import com.example.ecommerceapp.R;
import com.example.ecommerceapp.UserHelperClass;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FeedbackActivity extends AppCompatActivity {
    private EditText fbname, fbemail,fbmessage;
    private Button btnsavefb;
    DatabaseReference reff;
    FirebaseDatabase database;
    FeedbackClass feedbackClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        fbname = (EditText) findViewById(R.id.feedback_name);
        fbemail = (EditText) findViewById(R.id.email_feedback);
        fbmessage = (EditText) findViewById(R.id.feedback_message);
        btnsavefb  = (Button) findViewById(R.id.btnsavefb);
        feedbackClass = new FeedbackClass();
        reff = FirebaseDatabase.getInstance().getReference().child("Feeback");
        btnsavefb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final String name = fbname.getText().toString().trim();
                final String email = fbemail.getText().toString().trim();
                final String message = fbmessage.getText().toString().trim();

                if(TextUtils.isEmpty(name)){
                    Toast.makeText(getApplicationContext(), "Enter pls your name !", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(), "Enter pls your email !", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(TextUtils.isEmpty(message )){
                    Toast.makeText(getApplicationContext(), "Enter pls your message !", Toast.LENGTH_SHORT).show();
                    return;
                }

                feedbackClass= new FeedbackClass(name,email,message);
                reff.child(name).setValue(feedbackClass);
                Toast.makeText(FeedbackActivity.this,"Save Feedback Successful",Toast.LENGTH_LONG).show();
                startActivity(new Intent(FeedbackActivity .this, NavActivity.class));
                finish();
            }
    });

};
}

//    public void savefeedback(View view) {
//        database = FirebaseDatabase.getInstance();
//        reff = database.getReference("Feedback");
//        final String name = fbname.getText().toString();
//        final String email = fbemail.getText().toString();
//        final String message = fbmessage.getText().toString();
//
//
//
//
////        reff= FirebaseDatabase.getInstance().getReference().child("Product");
////        reff = FirebaseDatabase.getInstance(). getReference(). child("FeedbackClass");
////        reff.addValueEventListener(new ValueEventListener() {
//

 //       });
   // }

