package com.greenfox;

// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.
public class NumberAdder {

  public static void main(String[] args) {
    System.out.println("The sum of the numbers is: " + numberAdder(5));

  }

  public static int numberAdder(int limit) {
    if (limit == 1)
      return 1;
    else
      return numberAdder(limit - 1) + limit;
  }

}



