package com.example.ecommerceapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;

public class ChatActivity extends AppCompatActivity {

    private ImageView btnImage;
    private Button btnMsg;
    private EditText inputMessage;
    private RecyclerView msgList;
    private String msgSenderID, date,time;
    private FirebaseAuth mAuth;
    private EditText inputname;
    private long maxId = 0;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        mAuth = FirebaseAuth.getInstance();
        msgSenderID = mAuth.getCurrentUser().getUid();

        inputname= (EditText) findViewById(R.id.username);
        inputMessage = (EditText) findViewById(R.id.chat_message);
        btnMsg = (Button) findViewById(R.id.chat_send);
        btnImage = (ImageView) findViewById(R.id.chat_send_picture);
        msgList = (RecyclerView) findViewById(R.id.chat_recycler);


        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("Message").child(mAuth.getCurrentUser().getUid()) ;

                String message = inputMessage.getText().toString().trim();

                MessageClass messageClass = new MessageClass(message);



                if (TextUtils.isEmpty(message)) {
                    inputMessage.setError("Please type a message first");
                }
                else {
                    reference.child(message) .setValue(messageClass);
                    Toast.makeText(ChatActivity.this, "Message Sent Successfully", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}