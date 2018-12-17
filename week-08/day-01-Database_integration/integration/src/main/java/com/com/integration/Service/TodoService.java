package com.com.integration.Service;

import com.com.integration.Model.Todo;
import com.com.integration.Repository.TodoRepository;
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
