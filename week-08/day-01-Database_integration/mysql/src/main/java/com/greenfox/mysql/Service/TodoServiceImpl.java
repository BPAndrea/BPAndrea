package com.greenfox.mysql.Service;

import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImpl {

  TodoRepository todoRepository;

  @Autowired
  public TodoServiceImpl(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public void addTodo(Todo todo) {
    if (todo != null) {
      this.todoRepository.save(todo);
    }
  }

  public List<Todo> getActiveTodos(){
    List<Todo> activeTodos = new ArrayList<>();
    activeTodos = todoRepository.findAll()
        .stream()
        .filter(todo -> !todo.isDone())
        .collect(Collectors.toList());
    return activeTodos;
   }

  public List<Todo> getAllTodos() {
    List<Todo> todos = new ArrayList<>();
    todoRepository.findAll().forEach(todo -> todos.add(todo));
    return todos;
  }

}
