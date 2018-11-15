package com.greenfox;
// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {
  public static void main(String[] args) {
    String input = "lxukas a cipő xxxx";
    int size = input.length();
    System.out.println(xToY(input, size));

  }

  public static String xToY (String input, int size){
    if (size == 1)
      return input.replace('x', 'y');
    else
      return xToY(input, size-1);
  }
}
