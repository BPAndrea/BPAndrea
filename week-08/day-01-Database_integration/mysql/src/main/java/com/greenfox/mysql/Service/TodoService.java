package com.greenfox.mysql.Service;

import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  TodoRepository repository;

  @Autowired
  public TodoService(TodoRepository repository) {
    this.repository = repository;
  }

  public void addTodo(Todo todo) {
    if (todo != null) {
      this.repository.save(todo);
    }
  }
}

