package com.example.foxclub.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fox {
  private String name;
  private String food;
  private String drink;
  public List<String> tricks = Arrays.asList("CSS", "HTML", "Thymeleaf", "SpringBoot");

  public String getName() {
    return name;
  }

/*  public ArrayList<String> getTricks() {
    return (ArrayList)tricks;
  }*/

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public Fox(String name, String food, String drink) {
    this.name = name;
    this.food = food;
    this.drink = drink;
  }
}
