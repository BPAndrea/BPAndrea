package com.home.simbaagain.Controller;

import com.home.simbaagain.Repository.BankAccount;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {
  public List<BankAccount> accountList;

  public WebController() {
    accountList = new ArrayList<>();
    accountList.add(new BankAccount("Simba", 2000, "lion", "Zebra", true));
    accountList.add(new BankAccount("Nala", 1200, "lion", "HUF"));
    accountList.add(new BankAccount("Shenzi", 250, "hyena", "USD", false, false));
    accountList.add(new BankAccount("Gopher", 99, "gopher", "FT"));
  }

  public void increaseBalanceByName(String name) {
    for (int i = 0; i < accountList.size(); i++) {
      int actualBalance;
      if (name.equals(accountList.get(i).getName())) {
        actualBalance = accountList.get(i).getBalance();
        if (accountList.get(i).isKing()) {
          accountList.get(i).setBalance(actualBalance += 100);
        } else {
          accountList.get(i).setBalance(actualBalance += 10);
          System.out.println(actualBalance);
        }
      }
    }
  }
  /*  public void createAccount(BankAccount bankAccount){
      accountList.add(new BankAccount(bankAccount.setName(bankAccount), bankAccount.getBalance(), bankAccount.getAnimalType(), bankAccount.getCurrency()));
    }*/
  @GetMapping("/")
  public String getAccounts(Model model) {
    model.addAttribute("accounts", accountList.get(0));
    return "homepage";
  }

  @GetMapping("/multiple")
  public String getMoreAccounts(Model model) {
    model.addAttribute("accounts", accountList);
    return "homepage";
  }

  @PostMapping("/multiple")
  public String increaseBalance(@RequestParam(name = "increase") String name, Model model) {
    increaseBalanceByName(name);
    model.addAttribute("accounts", accountList);
    return "homepage";
  }

  @GetMapping("/add")
  public String addNewAccount(Model model) {
    model.addAttribute("account", new BankAccount());
    return "add-account";
  }

  @PostMapping("/add")
    public String addAccount(@ModelAttribute(name="bankAccount") BankAccount bankAccount, Model model){
      accountList.add(bankAccount);
      return "redirect:/multiple";
    }
  /*@PostMapping(
      value = "/add",
      consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  public String addAccount(@RequestBody MultiValueMap<String, String> formData) {
    BankAccount newAccount = new BankAccount(
        formData.toSingleValueMap().get("name"),
        Integer.parseInt(formData.toSingleValueMap().get("balance")),
        formData.toSingleValueMap().get("currency"),
        formData.toSingleValueMap().get("animalType")
    );
    this.accountList.add(newAccount);
    return "redirect:/multiple";
  }
  */
}


