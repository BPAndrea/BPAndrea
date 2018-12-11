package com.home.webshop.repository;

import java.util.ArrayList;
import java.util.List;

public class Stock {
  public List<ShopItem> shopItems;

  public Stock() {
    shopItems = new ArrayList<>();
    shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
    shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
    shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
    shopItems.add(new ShopItem("Wokin", "Chicken with fied rice and WOKIN sauce", 119, 100));
    shopItems.add(new ShopItem("T-shirt", "Blue a corgi on a bike", 300, 1));
  }

}
