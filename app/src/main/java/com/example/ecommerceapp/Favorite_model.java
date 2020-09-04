package com.example.ecommerceapp;

public class Favorite_model {
    String productName, productPrice, quantity, shipping, size;

    Favorite_model()
    {

    }

    public Favorite_model(String productName1, String productPrice1, String quantity1, String shipping1, String size1) {
        this.productName = productName1;
        this.productPrice = productPrice1;
        this.quantity = quantity1;
        this.shipping = shipping1;
        this.size = size1;
    }

    public String getProductName1() {
        return productName;
    }

    public void setProductName1(String productName) {
        this.productName = productName;
    }

    public String getProductPrice1() {
        return productPrice;
    }

    public void setProductPrice1(String productPrice1) {
        this.productPrice = productPrice1;
    }

    public String getQuantity1() {
        return quantity;
    }

    public void setQuantity1(String quantity1) {
        this.quantity = quantity1;
    }

    public String getShipping1() {
        return shipping;
    }

    public void setShipping1(String shipping1) {
        this.shipping = shipping1;
    }

    public String getSize1() {
        return size;
    }

    public void setSize1(String size1) {
        this.size = size1;
    }
}
