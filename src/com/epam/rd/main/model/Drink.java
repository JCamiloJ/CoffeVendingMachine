package com.epam.rd.main.model;

import com.epam.rd.main.utils.Size;

public abstract class Drink {

    private String name;
    private Size size;
    private int price;
    private int stock;

    public void currentItems(){}
    public void reStock(){}
    public void setPrice(){
        this.price = price;
    }

}

