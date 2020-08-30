package com.example.ecommerceapp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ChatActivity extends AppCompatActivity {

    private ImageView btnImage;
    private Button btnMsg;
    private EditText inputMessage;
    private RecyclerView msgList;
    private String msgSenderID, saveCurrentDate, saveCurrentTime;
    private FirebaseAuth mAuth;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        mAuth = FirebaseAuth.getInstance();
        msgSenderID = mAuth.getCurrentUser().getUid();

        inputMessage = (EditText) findViewById(R.id.chat_message);
        btnMsg = (Button) findViewById(R.id.chat_send);
        btnImage = (ImageView) findViewById(R.id.chat_send_picture);
        msgList=(RecyclerView)findViewById(R.id.chat_recycler) ;

        btnMsg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SendMessage();
            }
        });
    }

    private void SendMessage() {
        String messageText=inputMessage.getText().toString();
        if(TextUtils.isEmpty(messageText))
        {
            Toast.makeText(this,"Please type a message first...",Toast.LENGTH_SHORT).show();
        }
        else
        {
            rootNode = FirebaseDatabase.getInstance();

            Calendar calFordDate=Calendar.getInstance();
            SimpleDateFormat currentDate=new SimpleDateFormat("dd-MMMM-yyyy");
            saveCurrentDate=currentDate.format(calFordDate.getTime());

            Calendar calFordTime=Calendar.getInstance();
            SimpleDateFormat currentTime=new SimpleDateFormat("HH:mm aa");
            saveCurrentTime=currentTime.format(calFordTime.getTime());

            DatabaseReference mDatabase = FirebaseDatabase.getInstance().getReference().child("Users");
            DatabaseReference currentUserDB = mDatabase.child(mAuth.getCurrentUser().getUid());
            currentUserDB.child("Message").setValue(inputMessage);
            currentUserDB.child("Time").setValue(saveCurrentTime);
            currentUserDB.child("Date").setValue(saveCurrentDate);
            currentUserDB.child("From").setValue(msgSenderID);

            Toast.makeText(ChatActivity.this,"Message Sent Successfully",Toast.LENGTH_SHORT).show();

        }
            }
        }