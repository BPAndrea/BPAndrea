package com.greenfox.mysql.Controller;



import com.greenfox.mysql.Repository.TodoRepository;
import com.greenfox.mysql.Service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {
  private TodoServiceImpl todoService;

  @Autowired
  public TodoController(TodoServiceImpl todoService) {
    this.todoService = todoService;
  }

 // ki lehet törölni: private TodoRepository todoRepository;

/*
  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
*/

  @GetMapping("/todo/list")
  public String list(Model model, @RequestParam(value="isActive", required = false) boolean isActive){
    model.addAttribute("todos", todoService.findAll());
    return "todolist";
  }



}


