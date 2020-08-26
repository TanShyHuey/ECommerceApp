package com.example.ecommerceapp.ui.Model;

public class model
{
    String productName, productPrice, quantity, shipping, size;

    model()
    {

    }

    public model(String productName, String productPrice, String quantity, String shipping, String size) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.shipping = shipping;
        this.size = size;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getShipping() {
        return shipping;
    }

    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
