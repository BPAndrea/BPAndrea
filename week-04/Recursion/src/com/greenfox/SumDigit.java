package com.greenfox;
// Given a non-negative int n, return the sum of its digits recursively (no loops).
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {
  public static void main(String[] args) {

    System.out.println(sumDigit(458));

  }

  public static int sumDigit(int limit) {
    if (limit < 10)
      return limit%10;
    else
      return sumDigit((int) limit/10) + limit%10;
  }

}
