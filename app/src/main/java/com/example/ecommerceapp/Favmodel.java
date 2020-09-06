package com.example.ecommerceapp;

public class Favmodel {

   String name, prices;

    public Favmodel() {
    }

    public Favmodel(String name, String prices) {
        this.name = name;
        this.prices = prices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrices() {
        return prices;
    }

    public void setPrices(String prices) {
        this.prices = prices;
    }


}