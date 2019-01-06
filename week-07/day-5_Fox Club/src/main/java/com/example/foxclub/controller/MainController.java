package com.example.foxclub.controller;

import com.example.foxclub.model.Fox;
import com.example.foxclub.service.FoxService;
import com.example.foxclub.service.FoxServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String index(Model model) {
    model.addAttribute("fox", foxService.findFox("Mr. Green"));
   /* model.addAttribute("foxName", "Mr. Green");
    model.addAttribute("food", "salad");
    model.addAttribute("drink", "water");
    model.addAttribute("size", "1");
    model.addAttribute("tricks", "code in Java");*/
    return "index";
  }

 @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String findFox(@RequestParam(name = "name", required = false) String name, Model model) {
    if (name.equals(null) || name.equals(" ") || name==""){
      model.addAttribute("null", "Waiting for your input!");
      return "login";
    } else {
      Fox foxToReturn = foxService.findFox(name);
      if(foxToReturn == null) {
        model.addAttribute("notExists", "You have provided a name that has not been used before, add it as a new one!");
      return "login";
    } else {
      model.addAttribute("fox", foxToReturn);
      return "index";
    }
  }
}

  @GetMapping("/add")
  public String addForm(Model model) {
    model.addAttribute("fox", new Fox());
    return "add";
  }

  @PostMapping("/add")
  public String addFox(@ModelAttribute Fox fox, Model model) {
   foxService.addFox(fox);
   model.addAttribute("fox", fox);
    return "index";
  }

  @GetMapping("/nutrition")
  public String getForm(Model model) {
    model.addAttribute("fox",new Fox());
    return "nutrition";
  }

 /* @PostMapping("/login")
  public String addFox(@ModelAttribute(name = "name") String foxToAdd) {
    foxService.addNewFox(foxToAdd);
    foxService.findFoxByName(foxToAdd);
    return "redirect:/index";
  }*/
    }


