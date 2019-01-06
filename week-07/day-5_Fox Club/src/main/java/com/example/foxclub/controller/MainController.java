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
    model.addAttribute("change", "");
    model.addAttribute("color", "red");
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
        model.addAttribute("change", "");
        model.addAttribute("color", "red");
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
  public String getForm(@RequestParam(name="name", required = false) String name, Model model) {
    if (name != null && name != "") {
      if (foxService.findFox(name) != null) {
        model.addAttribute("giveName", "Please change the food and drink and push the bottom save!");
        model.addAttribute("fox", foxService.findFox(name));
        return "nutrition-update";
      } else {
        model.addAttribute("giveName", "Sorry I can't find the fox, please add it as a new one!");
        model.addAttribute("fox", new Fox());
        return "nutrition";
      }
    } else {
      model.addAttribute("giveName", "Please give me the name of your fox!");
      model.addAttribute("fox", new Fox());
    }
    return "nutrition";
  }

  @PostMapping("/nutrition/update")
  public String getFox(@ModelAttribute Fox fox, Model model) {
    foxService.addFox(fox);
    model.addAttribute("fox", fox);
    model.addAttribute("change", "Your fox details has been changed as follows: ");
    model.addAttribute("color", "red");
    return "index";
  }

 /* @PostMapping("/login")
  public String addFox(@ModelAttribute(name = "name") String foxToAdd) {
    foxService.addNewFox(foxToAdd);
    foxService.findFoxByName(foxToAdd);
    return "redirect:/index";
  }*/
    }


