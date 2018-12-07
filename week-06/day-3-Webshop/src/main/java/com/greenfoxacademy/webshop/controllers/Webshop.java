package com.greenfoxacademy.webshop.controllers;

/*The webshop stores ShopItems with at least 4 fields like name, description, price, quantityOfStock
    It can list the items in a nice table
    It contains basic links for filtering:
    List only available
    Order by the cheapest first
    List only those what contain "nike" in the name or description
    Show the average of the stock
    Show the most expensive available item's name*/

import com.greenfoxacademy.webshop.controllers.ShopItem;

import java.util.ArrayList;

public class Webshop {
  ArrayList<ShopItem> shopitems;

  public Webshop() {
    this.shopitems = new ArrayList<>();
  }

  public ArrayList<ShopItem> onlyAviable() {
    ArrayList<ShopItem> itemsAviable = new ArrayList<>();
    for (int i = 0; i < shopitems.size() ; i++) {
      if(shopitems.get(i).aviable)
        itemsAviable.add(shopitems.get(i));
    }
    return itemsAviable;
  }

  public void add(ShopItem shopitem) {
    shopitems.add(shopitem);
  }
}
