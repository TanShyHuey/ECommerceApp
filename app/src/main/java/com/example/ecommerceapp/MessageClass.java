package com.example.ecommerceapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.google.firebase.auth.FirebaseAuth;

public class MessageClass {

    String message;
    private FirebaseAuth mAuth;

    public MessageClass(String message){

        this.message=message;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }

}
