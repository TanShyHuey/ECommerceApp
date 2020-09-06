package com.example.ecommerceapp;

public class Hismodel {
    String pphone ,pemail,pname,paddress;

    public Hismodel() {
    }

    public Hismodel(String pphone, String pemail, String pname, String paddress) {
        this.pphone = pphone;
        this.pemail = pemail;
        this.pname = pname;
        this.paddress = paddress;
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

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPaddress() {
        return paddress;
    }

    public void setPaddress(String paddress) {
        this.paddress = paddress;
    }
}
