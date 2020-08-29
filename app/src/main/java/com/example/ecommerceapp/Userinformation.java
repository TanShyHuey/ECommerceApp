package com.example.ecommerceapp;

public class Userinformation {

    public String fullname;
    public String mail;
    public String phoneno;

    public Userinformation(){
    }

    public Userinformation(String fullname,String mail,String phoneno){
        this.fullname = fullname;
        this.mail = mail;
        this.phoneno = phoneno;
    }
    public String getUserName() {
        return fullname;
    }
    public String getEmail() {
        return mail;
    }
    public String getUserPhoneno() {
        return phoneno;
    }
}
