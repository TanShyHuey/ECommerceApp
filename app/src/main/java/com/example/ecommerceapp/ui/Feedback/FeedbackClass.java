package com.example.ecommerceapp.ui.Feedback;

public class FeedbackClass {
    private String fname, femail,fmessage;
    public FeedbackClass() {
    }

    public FeedbackClass(String fname , String femail ,String fmessage) {
        this.fname = fname;
        this.femail = femail;
        this.fmessage = fmessage;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }
    public void setFemail(String femail) {
        this.femail = femail;
    }
    public void setFmessage(String fmessage) {
        this.fmessage = fmessage;
    }

    public String getFname() {
        return fname;
    }


    public String getFemail() {
        return femail;
    }

    public String getFmessage () {
        return fmessage;
    }




}
