package com.greenfox.todaytasks.Service;

import org.springframework.stereotype.Service;


public class BlueColor implements MyColor{
  @Override
  public String printColor() {
    //System.out.println("It is blue in color...");
    return "It is blue in color...";
  }
}
