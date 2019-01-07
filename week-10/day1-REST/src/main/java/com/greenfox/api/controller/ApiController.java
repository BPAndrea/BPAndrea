package com.greenfox.api.controller;

import com.greenfox.api.model.*;
import com.greenfox.api.service.MainService;
import jdk.net.SocketFlow;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class ApiController {
  private MainService mainService;

  @Autowired
  public ApiController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Integer input) {
    mainService.saveLog(new Log("/doubling", input.toString()));
    if ((input == null) || (input.equals(""))) {
      return new ErrorMassage("Please provide an input!");
    } else {
      return new Doubling(input);
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name,
                        @RequestParam(value = "title", required = false) String title) {
    mainService.saveLog(new Log("/greeter", name + " ; " + title));
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
    mainService.saveLog(new Log("appenda", appendable));
    return new Append(appendable);
  }

  @PostMapping("dountil/{action}")
  public Object doUntil(@PathVariable(required = false) String action, @RequestBody(required = false) Until until) {
    mainService.saveLog(new Log("/dountil/{action}, action", until.toString()));
    if (until != null) {
      int value = until.getUntil();
      return new Result(action, value);
    } else {
      return new ErrorMassage("Please provide a number!");
    }
  }

  @GetMapping("/log")
  public List<Log> listLogs() {
    return mainService.getAllLogs();
  }


}
