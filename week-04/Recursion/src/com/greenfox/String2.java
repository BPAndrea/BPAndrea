package com.greenfox;
// Given a string, compute recursively a new string where all the 'x' chars have been removed.
public class String2 {
  public static void main(String[] args) {
    String input = "lxukas a cipxxxxő xxxx";
    int size = input.length();
    System.out.println(xRemove(input, size));

  }

  public static String xRemove(String input, int size) {
    if (size == 1)
      return input.replace("x", "");
    else
      return xRemove(input, size - 1);
  }
}
