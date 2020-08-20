package com.example.ecommerceapp;

public class product {
    private String ProductName;
    private String Quantity;
    private String Shipping;
    private String spinner2;
    private String ProductPrice;
    private String Size;
    private String Color;




    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getShipping() {
        return Shipping;
    }

    public void setShipping(String Shipping) {
        this.Shipping = Shipping;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public product(String color) {
        Color = color;
    }

    public String getSpinner2() {
        return spinner2;
    }

    public void setSpinner2(String spinner2) {
        this.spinner2 = spinner2;
    }

    public String getProductPrice() {
        return ProductPrice;
    }

    public void setProductPrice(String ProductPrice) {
        this.ProductPrice = ProductPrice;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String setSize) {
        this.Size = setSize;
    }

    public product() {

    }
}
