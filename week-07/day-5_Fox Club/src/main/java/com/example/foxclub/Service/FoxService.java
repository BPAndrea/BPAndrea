package com.example.foxclub.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FoxService {
  private ArrayList<Fox> foxes;
  //private List<String> tricks = Arrays.asList("CSS", "HTML", "Thymeleaf", "SpringBoot");
  Random random;

  public FoxService() {
    foxes = new ArrayList<>();
    foxes.add(new Fox("Mr. Fox", "salad", "water"));
    foxes.add(new Fox("Mr. Green", "cheese", "wine"));
    foxes.add(new Fox("Mr. Red", "pizza", "beer"));
    random = new Random();
  }

/*  public ArrayList<String> randomTricks() {
    ArrayList<String> foxTricks = new ArrayList<>();
    foxTricks.add(tricks.get(random.nextInt(tricks.size())));
    foxTricks.add(tricks.get(random.nextInt(tricks.size())));
    return foxTricks;
  }*/

}
