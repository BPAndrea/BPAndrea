package com.greenfox;

// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class Bunny1 {

  public static void main(String[] args) {
    System.out.println(bunny1(24));
  }

  public static int bunny1(int n) {
    if (n == 1)
      return 2;
    else
      return bunny1(n-1)+2;
   }
}
