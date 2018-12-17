package com.com.integration;

import com.com.integration.Model.Todo;
import com.com.integration.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntegrationApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public IntegrationApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(IntegrationApplication.class, args);
  }



  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day"));
    todoRepository.save(new Todo("Finish H2 workshop 1"));
  }
}

