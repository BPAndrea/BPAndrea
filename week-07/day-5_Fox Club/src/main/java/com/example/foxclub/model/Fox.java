package com.example.foxclub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Entity
public class Fox {
  @Id
  @GeneratedValue
  private Long id;
  private String name;
  private String food;
  private String drink;
  private int numberOfTricks = 1;
  //public List<String> tricksAllFoxes = Arrays.asList("code in Java", "write CSS", "write HTML", "tricks in Thymeleaf", "Guru in SpringBoot");
 // private List<String> tricks;
  private String tricks = "code in Java";
 //Random random;

  public Fox() {
  }

  public Fox(String name, String food, String drink, int numberOfTricks) {
    this.name = name;
    this.food = food;
    this.drink = drink;
    //this.numberOfTricks = numberOfTricks;
   // this.numberOfTricks = 1;
    //random = new Random();
    //this.tricks = initializeTricks();
    //this.tricks = Arrays.asList("code in Java", "write CSS", "write HTML");
   // this.tricks = Arrays.asList("code in Java", "write CSS", "write HTML");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public int getNumberOfTricks() {
    return numberOfTricks;
  }

  public void setNumberOfTricks(int numberOfTricks) {
    this.numberOfTricks = numberOfTricks;
  }

  public String getTricks() {
    return tricks;
  }

  public void setTricks(String tricks) {
    this.tricks = tricks;
  }
/* public ArrayList<String> initializeTricks(){
    this.tricks = new ArrayList<>();
    int numberOfTricks= random.nextInt(tricksAllFoxes.size()+1);
    for (int i = 0; i < numberOfTricks; i++) {
      tricks.add(tricksAllFoxes.get(i));
    }
    return (ArrayList)tricks;
  }*/



}

