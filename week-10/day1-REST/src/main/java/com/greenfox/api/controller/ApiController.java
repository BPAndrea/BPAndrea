package com.greenfox.api.controller;

import com.greenfox.api.model.*;
import jdk.net.SocketFlow;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class ApiController {

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    if ((input == null) || (input.equals(""))) {
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

  @GetMapping("/appenda/{appendable}")
  public Object append(@PathVariable String appendable) {
    //if (appendable != null) {
    return new Append(appendable);
    /*} else {
      return new HttpURLConnection() {
        @Override
        public void connect() throws IOException {
          return;
        }
      };*/

    @PostMapping("dountil/{action}")
    public Object doUntil(@PathVariable String action) {


    }
  }

}
