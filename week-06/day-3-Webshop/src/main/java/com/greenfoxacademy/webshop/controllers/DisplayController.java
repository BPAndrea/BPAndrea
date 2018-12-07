package com.greenfoxacademy.webshop.controllers;

import com.greenfoxacademy.webshop.repository.ShopItem;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DisplayController {
  List<ShopItem> shopItems;

  public DisplayController() {
    this.shopItems = new ArrayList<>();
    shopItems.add(new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5));
    shopItems.add(new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2));
    shopItems.add(new ShopItem("Coca cola", "0.5l standard coke", 25, 0));
    shopItems.add(new ShopItem("Wokin", "Chicken with fied rice and WOKIN sauce", 119, 100));
    shopItems.add(new ShopItem("T-shirt", "Blue a corgi on a bike", 300, 1));
  }

  @RequestMapping(value = "/myWebShop")
  public String displayItems(Model model) {
    //List<ShopItem> items = this.myWebshop.getProducts();
    model.addAttribute("shopitems", shopItems);
    return "myWebShop";
  }
}

/*  @Controller
  public class HelloWebController {
    @RequestMapping("/web/greeting")
    public String greeting(Model model) {
      model.addAttribute("name", " World");
      return "greeting";
    }*/
