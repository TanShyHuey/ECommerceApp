package com.example.ecommerceapp.ui.Feedback;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ecommerceapp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FeedbackActivity extends AppCompatActivity {
    private EditText fbname, fbemail,fbmessage;
    private Button btnsavefb;
    DatabaseReference reff;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        fbname = (EditText) findViewById(R.id.feedback_name);
        fbemail = (EditText) findViewById(R.id.email_feedback);
        fbmessage = (EditText) findViewById(R.id.feedback_message);
        btnsavefb  = (Button) findViewById(R.id.btnsavefb);
    }

    public void savefeedback(View view) {
        database = FirebaseDatabase.getInstance();
        reff = database.getReference("Feedback");
        final String name = fbname.getText().toString();
        final String email = fbemail.getText().toString();
        final String message = fbmessage.getText().toString();
//        reff= FirebaseDatabase.getInstance().getReference().child("Product");
//        reff = FirebaseDatabase.getInstance(). getReference(). child("FeedbackClass");
//        reff.addValueEventListener(new ValueEventListener() {


        }
}