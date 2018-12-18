package com.greenfox.mysql.Controller;



import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Repository.TodoRepository;
import com.greenfox.mysql.Service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("todo/list")
  public String list(Model model, @RequestParam(value="isActive", required = false) boolean isActive){
    if(isActive) {
      model.addAttribute("todos", todoService.getActiveTodos());
    } else {
      model.addAttribute("todos", todoService.getAllTodos());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String todoForm(Model model){
    model.addAttribute("todo", new Todo());
    return "add-todo";
  }

/*
  @PostMapping ("/todo/add")
  public String saveTodo(@RequestParam("name") String title){
    Todo todo = new Todo(title);
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }
*/


  @PostMapping ("/todo/add")
  public String saveTodo(@ModelAttribute("name") Todo todo){
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }
}

/*

  @PostMapping("/addtodo")
  public String addItem(@ModelAttribute Todo todo) {
    todoService.saveNewTodo(todo);
    return "redirect:/";
  }*/
