package com.example.ecommerceapp;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.google.firebase.auth.FirebaseAuth;

public class MessageClass {
    String message,date,time,msgSenderID;
    private FirebaseAuth mAuth;

    public MessageClass(String message,String date,String time,String msgSenderID){
        this.message=message;
        this.time=time;
        this.date=date;
        this.msgSenderID=msgSenderID;
    }

    public String getMessage(){
        return message;
    }

    public void setMessage(String message){
        this.message=message;
    }

    public String getDate(){
        Calendar calFordDate = Calendar.getInstance();
        SimpleDateFormat currentDate = new SimpleDateFormat("dd-MMMM-yyyy");
        date = currentDate.format(calFordDate.getTime());
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }

    public String getTime(){
        Calendar calFordTime = Calendar.getInstance();
        SimpleDateFormat currentTime = new SimpleDateFormat("HH:mm aa");
        time = currentTime.format(calFordTime.getTime());
        return date;
    }
    public void setTime(String date){
        this.date=date;
    }

    public String getMsgSenderID(){
        msgSenderID = mAuth.getCurrentUser().getUid();
        return msgSenderID;
    }
    public void setMsgSenderID(String msgSenderID){
        this.msgSenderID = msgSenderID;
    }

}
