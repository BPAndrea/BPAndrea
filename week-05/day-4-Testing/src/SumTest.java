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
/*Create different tests where you
    test your method with an empyt list
    with a list with one element in it
    with multiple elements in it
    with a null*/

public class SumTest {

  @Test
  public void SumTest() {
    Sum mySum = new Sum();
    ArrayList<Integer> test = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      test.add(i);
    }
    assertEquals(10, mySum.sum(test));
  }

  @Test
  public void SumTest1() {
    Sum mySum = new Sum();
    ArrayList<Integer> test = new ArrayList<>();
    assertEquals(0, mySum.sum(test));
  }

  @Test
  public void SumTest2() {
    Sum mySum = new Sum();
    ArrayList<Integer> test = new ArrayList<>();
    test.add(5);
    assertEquals(5, mySum.sum(test));
  }

  @Test
  public void SumTest3() {
    Sum mySum = new Sum();
    ArrayList<Integer> test = new ArrayList<>();
    test.add(0);
    assertEquals(0, mySum.sum(test));
  }

  @Test
  public void SumTest4() {
    Sum mySum = new Sum();
    ArrayList<Integer> test = new ArrayList<>();
    test.add(10);
    test.add(5);
    test.add(4);
    assertEquals(19, mySum.sum(test));
  }


}
