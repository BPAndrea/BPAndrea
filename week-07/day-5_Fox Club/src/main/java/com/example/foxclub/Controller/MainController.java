package com.example.foxclub.Controller;

import com.example.foxclub.Service.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class MainController {
  List<Fox> foxes;
  Fox myFox;


  public MainController(List<Fox> foxes, Fox myFox){
    this.foxes = foxes;
    this.myFox = myFox;
  }


  @GetMapping("/")
  public String index() {
    return "index";
  }

  @GetMapping("/login")
  public String getLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String index(@RequestParam(name = "name") String name, Model model) {
    model.addAttribute("foxname", "vmi");
    return "redirect:/";
  }
}
