package com.example.foxclub.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Fox {
  private String name;
  private String food;
  private String drink;
  public List<String> tricksAllFoxes = Arrays.asList("code in Java", "write CSS", "write HTML", "tricks in Thymeleaf", "Guru in SpringBoot");
  private List<String> tricks;
  Random random;

  public String getName() {
    return name;
  }

  public ArrayList<String> getTricks() {
    return (ArrayList) tricks;
  }

 public ArrayList<String> initializeTricks(){
    this.tricks = new ArrayList<>();
    int numberOfTricks= random.nextInt(tricksAllFoxes.size()+1);
    for (int i = 0; i < numberOfTricks; i++) {
      tricks.add(tricksAllFoxes.get(i));
    }
    return (ArrayList)tricks;
  }

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
    random = new Random();
    this.tricks = initializeTricks();
   // this.tricks = Arrays.asList("code in Java", "write CSS", "write HTML", "tricks in Thymeleaf", "Guru in SpringBoot");
  }
}

