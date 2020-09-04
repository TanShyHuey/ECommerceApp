package com.example.ecommerceapp;

public class PayDetail {
    private String pname, pphone,pemail, paddress, pnotes;

    public PayDetail() {
    }

    public PayDetail(String pname, String pphone, String pemail, String paddress, String pnotes) {
        this.pname = pname;
        this.pphone = pphone;
        this.pemail = pemail;
        this.paddress = paddress;
        this.pnotes = pnotes;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPphone() {
        return pphone;
    }

    public void setPphone(String pphone) {
        this.pphone = pphone;
    }

    public String getPemail() {
        return pemail;
    }

    public void setPemail(String pemail) {
        this.pemail = pemail;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }

    public String getPnotes() {
        return pnotes;
    }

    public void setPnotes(String pnotes) {
        this.pnotes = pnotes;
    }
}
