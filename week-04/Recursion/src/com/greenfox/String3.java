package com.greenfox;
// Given a string, compute recursively a new string where all the
// adjacent chars are now separated by a "*".

public class String3 {
  public static void main(String[] args) {
    String input = "hosszabb szó";
    int size = input.length();
    System.out.println(concat(input, size));
  }

  public static String concat (String input, int size) {
    if (size == 1)
      return input.substring(size-1, size)+"*";
    else
      return concat(input, size - 1)+input.substring(size-1, size)+"*";
  }
}
