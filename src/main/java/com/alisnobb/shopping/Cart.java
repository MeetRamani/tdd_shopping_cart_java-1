package com.alisnobb.shopping;


import java.util.*;
import java.util.stream.Collectors;


public class Cart {

   private Map<Item, Integer> cart = new HashMap<>();
   private float totalPrice;

    public float getTotalPrice() {
        return totalPrice;
    }

    public Map<Item, Integer> getCart() {
        return cart;
    }

    public List getItems(){
        return cart.entrySet().stream().map(entry -> entry.getKey()).collect(Collectors.toList());
    }

    public void addItem(Item item, int quantity){
        cart.put(item, quantity);
        totalPrice = item.getPrice()*quantity;
    }

    public List<String> itemizedList(){
        return cart.entrySet().stream().map(entry -> ""+entry.getKey().getName()+" x"+entry.getValue()+" - $"+ String.format("%,.02f", entry.getKey().getPrice()*entry.getValue())).collect(Collectors.toList());
    }

    public List<String> itemQuantities(){

       return cart.entrySet().stream().map(entry -> ""+entry.getKey().getName()+" - x"+entry.getValue()).collect(Collectors.toList());
    }

    public List<String> onSaleItems(){
        return cart.entrySet().stream().filter(entry -> entry.getKey().isOnSale() == true).map(entry -> ""+entry.getKey().getName()+" x"+entry.getValue()+" - $"+ String.format("%,.02f", entry.getKey().getPrice()*entry.getValue())).collect(Collectors.toList());
    }
}