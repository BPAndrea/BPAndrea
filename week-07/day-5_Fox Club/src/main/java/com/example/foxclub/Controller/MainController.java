package com.example.foxclub.Controller;

import com.example.foxclub.Service.Fox;
import com.example.foxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MainController {

  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }
  @GetMapping("/")
  public String index() {
    return "index";
  }

 /* @GetMapping("/login")
  public String getLogin() {
    return "login";
  }*/

  @GetMapping("/login")
  public String findFox(@RequestParam(name = "name", required = false) String name, Model model) {
    Fox foxToReturn;
    int index;
    if (name != null) {
      foxToReturn = foxService.findFoxByName(name);
      index = foxService.getFoxByIndex(name);
     if (index == 0) {
        model.addAttribute("notExists", "You have provided a name that has not been used before, add it as a new one!");
        return "login";
      } else {
        model.addAttribute("foxName", foxService.findFoxByName(name).getName());
        model.addAttribute("food", foxService.findFoxByName(name).getFood());
        model.addAttribute("drink", foxService.findFoxByName(name).getDrink());
        model.addAttribute("tricks", foxService.findFoxByName(name).getTricks());
        return "index";
      }
    }else {
      model.addAttribute("null", "Waiting for your imput!");
      return "login";
    }
  }

  @PostMapping("/login")
  public String addFox(@ModelAttribute(name="name") String foxToAdd) {
    foxService.addNewFox(foxToAdd);
    foxService.findFoxByName(foxToAdd);
    return "redirect:/index";
  }
}


