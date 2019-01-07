package com.greenfox.api.controller;

import com.greenfox.api.model.Doubling;
import com.greenfox.api.model.ErrorMassage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if((input == null) || (input.equals(""))) {
      return new ErrorMassage("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }

}
