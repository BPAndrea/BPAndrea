package dominoComparable;
/*Implement the Comparable interface on the Domino
    why? we want to compare based on the result of Domino.compareTo()
    more info here
    First compare the first value and then the second*/


import java.util.Arrays;

public class Domino implements Comparable<Domino> , Printable {
  private final int left;
  private final int right;

  public Domino(int left, int right) {
    this.left = left;
    this.right = right;
  }

  public int getLeftSide() {
    return left;
  }

  public int getRightSide() {
    return right;
  }

  @Override
  public String toString() {
    return "[" + left + ", " + right + "]";
  }


  public int compareTo(Domino second) {
    if(this.getLeftSide() > second.getLeftSide())
      return 1;
    else if ((this.getLeftSide() == second.getLeftSide()) && (this.getLeftSide() > second.getLeftSide()))
      return 1;
    else
      return -1;
  }

  @Override
  public void printAllFields() {
      System.out.print("[" + left + ", " + right + "]");
    }
  }

