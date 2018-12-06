package com.greenfoxacademy.springstart.controllers;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting extends AtomicLong {
  public static AtomicLong counter = new AtomicLong(1);
  public static long  id;
  public String content;


  public Greeting(String content) {
    // public Greeting(long id, String content) { //previous task
    //this.id = 1;  //previous task
    this.id = counter.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }



}
