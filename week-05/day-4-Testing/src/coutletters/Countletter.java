package coutletters;

import java.util.HashMap;
import java.util.Map;

/*Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.
    Create a test for that.*/
public class Countletter {

/*
  public static void main(String[] args) {
    String input = "countlEtTers";
    System.out.println((countletters(input)));
  }
*/


  public Map<Character, Integer> countletters(String input) {
    input = input.toLowerCase();
    Map<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < input.length(); i++) {
      if (map.containsKey(input.charAt(i))) {
        map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
      } else {
        map.put(input.charAt(i), 1);
      }
    }
    return map;
  }
}
