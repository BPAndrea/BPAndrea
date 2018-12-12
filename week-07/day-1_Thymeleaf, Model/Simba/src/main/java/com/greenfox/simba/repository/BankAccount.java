package com.greenfox.simba.repository;

public class BankAccount {
  private String name;
  private int balance;
  private String animalType;
  private String currency = "Zebra";

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount(String name, int balance, String animalType, String currency) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
  }

  public String getName() {
    return name;
  }

  public int getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public String getCurrency() {
    return currency;
  }
}
