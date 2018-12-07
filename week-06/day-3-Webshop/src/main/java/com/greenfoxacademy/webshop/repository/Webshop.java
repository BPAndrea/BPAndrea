/*
package com.greenfoxacademy.webshop.repository;

*/
/*The webshop stores ShopItems with at least 4 fields like name, description, price, quantityOfStock
    It can list the items in a nice table
    It contains basic links for filtering:
    List only available
    Order by the cheapest first
    List only those what contain "nike" in the name or description
    Show the average of the stock
    Show the most expensive available item's name*//*


import com.greenfoxacademy.webshop.repository.ShopItem;

import java.util.ArrayList;

public class Webshop {
  ArrayList<ShopItem> shopitems;
  //private static Webshop instance;

  public Webshop() {
    this.shopitems = new ArrayList<>();
    this.shopitems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
    this.shopitems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
    this.shopitems.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
    this.shopitems.add(new ShopItem("Wokin", "Chicken with fied rice and WOKIN sauce", 119, 100));
    this.shopitems.add(new ShopItem("T-shirt", "Blue a corgi on a bike", 300, 1));
  }

  // singleton design pattern
*/
/*  public static Webshop getInstance() {
    if(Webshop.instance == null) {
      Webshop.instance = new Webshop();
    }
    return Webshop.instance;
  }*//*


  public ArrayList<ShopItem> getShopitems() {
    return this.shopitems;
  }
*/
/*
  public ArrayList<ShopItem> getProducts() {
    return this.getInstance().getProducts();
  }*//*



  public void addProduct(ShopItem item) {
    this.shopitems.add(item);
  }

  */
/*public ArrayList<ShopItem> onlyAviable() {
    ArrayList<ShopItem> itemsAviable = new ArrayList<>();
    for (int i = 0; i < shopitems.size() ; i++) {
      if(shopitems.get(i).aviable)
        itemsAviable.add(shopitems.get(i));
    }
    return itemsAviable;
  }*//*

}
*/

