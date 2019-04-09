
package com.home.hackathon.controller;


import com.home.hackathon.repository.ShopItem;
import com.home.hackathon.repository.Stock;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Comparator;
import java.util.stream.Collectors;


@Controller
public class WebController {
  Stock myStock;

  public WebController() {
    myStock = new Stock();
  }

  @RequestMapping(value="/webshop")
   public String display(Model model) {
    model.addAttribute("elements", myStock.shopItems);
       return "webshop";

  }

  @RequestMapping(value="/only-available")
  public String getOnlyAviable(Model model) {
    model.addAttribute("elements", myStock.shopItems
        .stream()
        .filter(productOnStock -> productOnStock.getQuantityOfStock() > 0)
        .collect(Collectors.toList()));

    return "webshop";
  }

  @RequestMapping(value="/cheapest-first")
  public String getCheapestFirst(Model model) {
    model.addAttribute("elements", myStock.shopItems
        .stream()
        .filter(productOnStock -> productOnStock.getQuantityOfStock() > 0)
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toList()));

    return "webshop";
  }

  @RequestMapping(value="/contains-nike")
  public String getNike(Model model) {
    model.addAttribute("elements", myStock.shopItems
        .stream()
        .filter(product -> product.getName().toLowerCase().contains("nike") || product.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toList()));

    return "webshop";
  }

  @RequestMapping(value="/most-expensive")
  public String getMostExpensive(Model model) {
    model.addAttribute("elements", myStock.shopItems
        .stream()
        .max(Comparator.comparing(ShopItem::getPrice))
        .get());

    return "webshop";
  }


  @RequestMapping(value="/average-stock")
  public String getAverage(Model model) {
    double average = myStock.shopItems
        .stream()
        .mapToDouble(ShopItem::getQuantityOfStock)
        .summaryStatistics()
        .getAverage();

    model.addAttribute("average", average);
    return "average-stock";
  }

  @RequestMapping(value="/search")
  public String getSearch(Model model, @RequestParam String item) {
    model.addAttribute("elements", myStock.shopItems
        .stream()
        .filter(searched -> searched.getName().toLowerCase().contains(item) || searched.getDescription().toLowerCase().contains(item))
        .collect(Collectors.toList()));
    return "webshop";
  }

}

