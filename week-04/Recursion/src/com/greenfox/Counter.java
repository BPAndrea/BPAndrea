package com.greenfox;

// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter {
  public static void main(String[] args) {

    counter (6);

  }

  public static void counter (int input){
    System.out.println(input);
     if(input>0) {
       counter(input - 1);
    }
  }
}
