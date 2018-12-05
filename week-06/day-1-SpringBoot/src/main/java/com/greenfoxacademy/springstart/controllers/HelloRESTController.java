package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController extends AtomicLong {
  @RequestMapping
  @ResponseBody
  public Greeting greeting(@RequestParam ("name") String name) {

    //Greeting input = new Greeting( 1,"Hello " + name);
    Greeting input2 = new Greeting("Hello " + name);
    return input2;
  }
}
