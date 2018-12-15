package com.example.foxclub.Controller;

import com.example.foxclub.Service.Fox;
import com.example.foxclub.Service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    if (name != null) {

      model.addAttribute("foxName", foxService.findFoxByName(name).getName());
      model.addAttribute("food", foxService.findFoxByName(name).getFood());
      model.addAttribute("drink", foxService.findFoxByName(name).getDrink());
      model.addAttribute("tricks", foxService.findFoxByName(name).getTricks());
      return "index";
    } else {
      return "login";
    }
  }
}
