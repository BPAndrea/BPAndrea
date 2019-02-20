package com.greenfox.inmemory.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RESTController {

  @GetMapping("/rest/hello")
  public String hello() {
    return "Hello World!";
  }
}
