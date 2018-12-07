package com.greenfoxacademy.webshop;

import com.greenfoxacademy.webshop.controllers.ShopItem;
import com.greenfoxacademy.webshop.controllers.Webshop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class WebshopApplication {

  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);
    ShopItem myItem1 = new ShopItem("Running shoes", "Nike running shoes for every day sport", 1000, 5);
    ShopItem myItem2 = new ShopItem("Printer", "Some HP printer that will print pages", 3000, 2);
    ShopItem myItem3 = new ShopItem("Coca cola", "0.5l standard coke", 25, 0);
    ShopItem myItem4 = new ShopItem("Wokin", "Chicken with fied rice and WOKIN sauce", 119, 100);
    ShopItem myItem5 = new ShopItem("T-shirt", "Blue a corgi on a bike", 300, 1);

    Webshop myWebshop = new Webshop();
    myWebshop.add(myItem1);
    myWebshop.add(myItem2);
    myWebshop.add(myItem3);
    myWebshop.add(myItem4);
    myWebshop.add(myItem5);
  }

  @Controller
  public class Hello {
    @RequestMapping(value = "/webshop")
    @ResponseBody
    public String hello() {

      return "Hello";
    }
  }
}
