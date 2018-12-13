package com.greenfox.todaytasks.Service;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor{
  @Override
  public String printColor() {
    //System.out.println("It is red in color...");
    return "It is red in color...";
  }
}
