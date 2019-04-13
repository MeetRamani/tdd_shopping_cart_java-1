package com.alisnobb.shopping;

public class Item {

    private String name;
    private float price;
    private boolean onSale;

    public Item() {
    }

    public Item(String name, float price, boolean onSale) {
        this.name = name;
        this.price = price;
        this.onSale = onSale;
    }

    public String getName() {
        return name;
    }

    public Item withName(String name) {
        this.name = name;
        return this;
    }

    public float getPrice() {
        return price;
    }

    public Item withPrice(float price) {
        this.price = price;
        return this;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public Item withOnSale(boolean onSale) {
        this.onSale = onSale;
        return this;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", onSale=" + onSale +
                '}';
    }
}