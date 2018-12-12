package com.greenfox.simba.controller;

import com.greenfox.simba.repository.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AccountController {
  public List<BankAccount> accounts = new ArrayList<>();

  public AccountController() {
    accounts.add(new BankAccount("Simba", 2000, "lion", "Zebra"));
  }

  @GetMapping("/show")
  public String showAccount(Model model) {
    model.addAttribute("accounts", accounts);
    return "account";
  }

  @GetMapping("/text")
  public String showString(Model model) {
    model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "account";
  }
}
