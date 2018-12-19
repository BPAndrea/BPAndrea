package com.greenfox.mysql.Controller;


import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Repository.TodoRepository;
import com.greenfox.mysql.Service.AssigneeServiceImpl;
import com.greenfox.mysql.Service.TodoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TodoController {
  private TodoServiceImpl todoService;
  private AssigneeServiceImpl assigneeService;

  @Autowired
  public TodoController(TodoServiceImpl todoService, AssigneeServiceImpl assigneeService) {
    this.todoService = todoService;
    this.assigneeService = assigneeService;
  }

  // ki lehet törölni: private TodoRepository todoRepository;

/*
  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }
*/

  @GetMapping("todo/list")
  public String list(Model model, @RequestParam(value = "isActive", required = false) boolean isActive) {
    model.addAttribute("todo", new Todo());
    if (isActive) {
      model.addAttribute("todos", todoService.getActiveTodos());
    } else {
      model.addAttribute("todos", todoService.getAllTodos());
    }
    return "todolist";
  }

  @GetMapping("/todo/add")
  public String todoForm(Model model) {
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


  @PostMapping("/todo/add")
  public String saveTodo(@ModelAttribute("name") Todo todo) {
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }

  @GetMapping("/todo/{id}/delete")
  public String deleteElement(@PathVariable long id) {
    todoService.delete(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/todo/{id}/edit")
  public String editForm(@PathVariable long id, Model model) {
    model.addAttribute("todo", todoService.findTodo(id));
    return "edit";
  }

  @PostMapping("/todo/{id}/edit")
  public String editElement(@ModelAttribute("name") Todo todo) {
    todoService.addTodo(todo);
    return "redirect:/todo/list";
  }


  @PostMapping("/todo/search")
  public String searchTodo(@RequestParam("title") String title, Model model) {
    List<Todo> result = todoService.findTodo(title);
    if (result.size() == 0) {
      model.addAttribute("queryResult", "No todos found with the given name (title or description)");
    } else {
      model.addAttribute("queryResult", title + " was found in the Todo list:");
      model.addAttribute("foundItems", result);
    }
    return "search";
  }


}
