package com.greenfox;
// Create a recursive function called `refactorio`
// that returns it's input's factorial

public class Factorio {
  public static void main(String[] args) {
    System.out.println(refactorio(4));

  }

  public static int refactorio (int number){
    if (number == 1)
      return number;
    else
      return refactorio(number-1)*number;
  }
}
