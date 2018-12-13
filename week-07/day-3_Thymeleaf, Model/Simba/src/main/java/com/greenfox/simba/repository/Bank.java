package com.greenfox.simba.repository;

import java.util.ArrayList;
import java.util.List;

public class Bank {
  public List<BankAccount> accounts;

  public Bank() {
    this.accounts = new ArrayList<>();
    accounts.add(new BankAccount("Simba", 2000, "lion", "Zebra", true));
    accounts.add(new BankAccount("Nala", 1200, "lion", "Nala"));
    accounts.add(new BankAccount("Shenzi", 250, "hyena", "USD", false, false));
    accounts.add(new BankAccount("Gopher", 99, "gopher", "FT"));
  }
}

