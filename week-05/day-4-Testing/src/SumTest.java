import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/*Create a sum method in your class which has an ArrayList of Integers as parameter
    It should return the sum of the elements in the list
    Follow these steps:
    Add a new test case
    Instantiate your class
    create a list of integers
        use the assertEquals to test the result of the created sum method*/
public class SumTest {

  @Test
  public void SumTest() {
    Sum mySum = new Sum();
    ArrayList<Integer> test = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      test.add(i);
    }
    // ArrayList<Integer> test = (ArrayList<Integer>) Arrays.asList (1, 2, 3, 4);
    assertEquals(10, mySum.sum(test));
  }

}
