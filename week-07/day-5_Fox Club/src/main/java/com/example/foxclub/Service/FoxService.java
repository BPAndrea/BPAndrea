package com.example.foxclub.Service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class FoxService {
  private ArrayList<Fox> foxes;
  //private List<String> tricks = Arrays.asList("CSS", "HTML", "Thymeleaf", "SpringBoot");
  //Random random;

  public FoxService() {
    foxes = new ArrayList<>();
    foxes.add(new Fox("I'm NOT existing", "", ""));
    foxes.add(new Fox("test", "salad", "water"));
    foxes.add(new Fox("Mr. Fox", "salad", "water"));
    foxes.add(new Fox("Mr. Green", "cheese", "wine"));
    foxes.add(new Fox("Mr. Red", "pizza", "beer"));
    //random = new Random();
  }

  public void addNewFox(String name) {
    foxes.add(new Fox("name", "snacks", "Cola"));
  }

  public Fox findFoxByName(String name) {
    int index = 0;
    for (int i = 0; i < foxes.size() ; i++) {
      if(foxes.get(i).getName().equals(name)){
        index = i;
      }
    }
    return foxes.get(index);
    }

  public int getFoxByIndex(String name) {
    int index = 0;
    for (int i = 0; i < foxes.size() ; i++) {
      if(foxes.get(i).getName().equals(name)){
        index = i;
      }
    }
    return index;
  }

 /* public int getFoxIndex(Fox name) {
      for (int i = 0; i < foxes.size() ; i++) {
        if (i == index)
        if(foxes.get(i).getName().equals(name)){
          index = i;
        }
      }
      return index;
    }*/
  }


/*  public ArrayList<String> randomTricks() {
    ArrayList<String> foxTricks = new ArrayList<>();
    foxTricks.add(tricks.get(random.nextInt(tricks.size())));
    foxTricks.add(tricks.get(random.nextInt(tricks.size())));
    return foxTricks;
  }*/


