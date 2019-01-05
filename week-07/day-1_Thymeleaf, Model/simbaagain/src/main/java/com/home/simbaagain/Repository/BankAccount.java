package com.home.simbaagain.Repository;

import org.springframework.stereotype.Service;


public class BankAccount {
  public String name;
  private int balance;
  private String animalType;
  private String currency;
  private boolean isKing = false;
  private boolean isGood = true;

  public BankAccount() {
  }

  public BankAccount(String name, int balance, String animalType, String currency) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
  }

  public BankAccount(String name, int balance, String animalType) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
  }

  public BankAccount(String name, int balance, String animalType, String currency, boolean isKing) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isKing = isKing;
  }

  public BankAccount(String name, int balance, String animalType, String currency, boolean isKing, boolean isGood) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.currency = currency;
    this.isKing = isKing;
    this.isGood = isGood;
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

  public boolean isKing() {
    return isKing;
  }

  public boolean isGood() {
    return isGood;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }
}
