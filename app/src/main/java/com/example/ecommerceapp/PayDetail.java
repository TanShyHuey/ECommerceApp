package com.example.ecommerceapp;

public class PayDetail {
    private String name, address,email, phone, notes;

    public PayDetail() {
    }

    public PayDetail(String name, String address, String email, String phone, String notes) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.notes = notes;
    }
}
