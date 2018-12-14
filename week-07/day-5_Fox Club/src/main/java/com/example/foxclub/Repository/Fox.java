package com.example.foxclub.Repository;

import java.util.ArrayList;

public class Fox {
  private String name;
  private ArrayList<String> tricks;
  private String food;
  private String drink;

  public String getName() {
    return name;
  }

  public ArrayList<String> getTricks() {
    return tricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public Fox(String name, ArrayList<String> tricks, String food, String drink) {
    this.name = name;
    this.tricks = tricks;
    this.food = food;
    this.drink = drink;
  }
}
