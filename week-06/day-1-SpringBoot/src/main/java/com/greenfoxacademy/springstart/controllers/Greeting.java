package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting extends AtomicLong {
  long id;
  String content;
  public static AtomicLong counter = new AtomicLong();

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

//public long getAndIncrement(){
//    return counter++;
//  }

 // public Greeting(long id, String content) { //previous task
  public Greeting(String content) {
    //this.id = 1;  //previous task
    this.id = counter.getAndIncrement();
    this.content = content;
  }
}
