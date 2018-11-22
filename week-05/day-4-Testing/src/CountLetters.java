/*import java.util.HashMap;

public class CountLetters {
*//*  Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys, and numbers as values that shows how many occurrences there are.*//*

  public static void main(String[] args) {
    String inputString ="Nanemár";
    inputString = inputString.toLowerCase();
    System.out.println(inputString);
  }

  public static void count(String inputString) {
    inputString = inputString.toLowerCase();
    HashMap<Character, Integer> dictionary = new HashMap<>();
    for (int i = 0; i < inputString.length() ; i++) {
      dictionary.put(inputString.charAt(i), 1);
    }
    for (int i = 0; i < dictionary.size(); i++) {
      if(dictionary.get(i) == dictionary.get(i+1))
        dictionary.get(i).intValue();
    }
  }


    public HashMap<Character, Integer> letterCounter(String stringToCount) {

      String allLowerCase = stringToCount.toLowerCase();

      for (int i = 0; i < allLowerCase.length() ; i++) {
        if (countedList.containsKey(stringToCount.charAt(i))){
          countedList.put(stringToCount.charAt(i), countedList.get(stringToCount.charAt(i))+1);
        } else {
          countedList.put(stringToCount.charAt(i), 1);
        }

      }

      return countedList;
    }

}*/
