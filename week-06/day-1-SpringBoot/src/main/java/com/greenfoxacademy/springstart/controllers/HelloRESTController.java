package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloRESTController extends AtomicLong {
  @RequestMapping("/greeting")
  public Greeting greeting(@RequestParam String name) {

    //Greeting input = new Greeting( 1,"Hello " + name);
    //Greeting input2 = new Greeting("Hello " + name);
    return new Greeting("Hello " + name);
  }
}
