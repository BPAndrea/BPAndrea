import java.util.ArrayList;

public class Sum {
  /*Create a sum method in your class which has an ArrayList of Integers as parameter
     It should return the sum of the elements in the list
     Follow these steps:
     Add a new test case
     Instantiate your class
     create a list of integers
         use the assertEquals to test the result of the created sum method*/

  public int sum(ArrayList<Integer> input) {
    int result =0;
    for (int i = 0; i < input.size() ; i++) {
      result+=input.get(i);
    }
    return result;
  }

}
