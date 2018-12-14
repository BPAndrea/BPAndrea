package com.greenfox.todaytasks.Controller;

import com.greenfox.todaytasks.Service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilities {
  private UtilityService utilityService;

  @Autowired
  public UsefulUtilities(UtilityService utilityService){
    this.utilityService = utilityService;
  }

  @GetMapping ("/useful")
  public String index() {
  return "index";
  }

  @GetMapping ("/useful/colored")
  public String randomBackground (Model model){
    model.addAttribute("color", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String emailValidator(@RequestParam(value="email") String email, Model model) {
    if (utilityService.validateEmail(email)) {
      model.addAttribute("emailChecked", email + " is a valid email address.");
      model.addAttribute("color", "green");
    } else {
      model.addAttribute("emailChecked", email + " is not a valid email address!");
      model.addAttribute("color", "red");
    }
    return "email";
  }
}


