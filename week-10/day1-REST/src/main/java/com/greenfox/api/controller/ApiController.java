package com.greenfox.api.controller;

import com.greenfox.api.model.Doubling;
import com.greenfox.api.model.ErrorMassage;
import com.greenfox.api.model.Greeter;
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

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    if ((name == null) && (title == null)) {
      return new ErrorMassage("Please provide a name and a title!");
    } else if (name == null) {
      return new ErrorMassage("Please provide a name!");
    } else if (title == null) {
      return new ErrorMassage("Please provide a title!");
    } else {
      return new Greeter(name, title);
    }


  }


}
