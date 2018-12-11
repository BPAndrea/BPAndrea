package com.home.webshop;

import com.home.webshop.repository.ShopItem;
import com.home.webshop.repository.Stock;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication

public class WebshopApplication {


  public static void main(String[] args) {
    SpringApplication.run(WebshopApplication.class, args);

  }



}
