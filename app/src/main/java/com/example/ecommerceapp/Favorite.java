package com.example.ecommerceapp;

public class Favorite
{
    private String FavProductName;
    private String FavQuantity;
    private String FavShipping;
    private String spinner2;
    private String FavProductPrice;
    private String FavSize;
    private String FavColor;

    public Favorite() {
    }

    public String getFavProductNameProductName() {
        return FavProductName;
    }

    public void setFavProductName(String productName) {
        FavProductName = productName;
    }

    public String getFavQuantity() {
        return FavQuantity;
    }

    public void setFavQuantity(String quantity) {
        FavQuantity = quantity;
    }

    public String getFavShipping() {
        return FavShipping;
    }

    public void setFavShipping(String shipping) {
        FavShipping = shipping;
    }

    public String getSpinner2() {
        return spinner2;
    }

    public void setSpinner2(String spinner2) {
        this.spinner2 = spinner2;
    }

    public String getFavProductPrice() {
        return FavProductPrice;
    }

    public void setFavProductPrice(String productPrice) {
        FavProductPrice = productPrice;
    }

    public String getFavSize() {
        return FavSize;
    }

    public void setFavSize(String size) {
        FavSize = size;
    }

    public String getFavColor() {
        return FavColor;
    }

    public void setFavColor(String color) {
        FavColor = color;
    }
}
