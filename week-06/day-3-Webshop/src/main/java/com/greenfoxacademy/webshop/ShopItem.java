package com.greenfoxacademy.webshop;
/*The webshop stores ShopItems with at least 4 fields like name, description, price, quantityOfStock
    It can list the items in a nice table
    It contains basic links for filtering:
    List only available
    Order by the cheapest first
    List only those what contain "nike" in the name or description
    Show the average of the stock
    Show the most expensive available item's name*/

public class ShopItem {
  String name;
  String description;
  int price;
  int quantityOfStock;
  boolean aviable;


  public ShopItem(String name, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
    this.aviable = isAviable();
  }

  public boolean isAviable() {
    if (quantityOfStock > 0)
      return true;
    else
      return false;
  }
}




