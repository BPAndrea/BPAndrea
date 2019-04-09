package com.home.hackathon.repository;
/*Features
    The webshop stores ShopItems with at least 4 fields like name, description, price, quantityOfStock
    It can list the items in a nice table
    It contains basic links for filtering:
    List only available
    Order by the cheapest first
    List only those what contain "nike" in the name or description
    Show the average of the stock
    Show the most expensive available item's name*/

public class ShopItem {
  private String name;
  private String description;
  private int price;
  private int quantityOfStock;

  public ShopItem(String name, String description, int price, int quantityOfStock) {
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantityOfStock = quantityOfStock;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public int getPrice() {
    return price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }
}
