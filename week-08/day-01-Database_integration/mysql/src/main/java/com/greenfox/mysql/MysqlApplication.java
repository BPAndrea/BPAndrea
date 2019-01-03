package com.greenfox.mysql;

import com.greenfox.mysql.Model.Assignee;
import com.greenfox.mysql.Model.Todo;
import com.greenfox.mysql.Repository.AssigneeRepository;
import com.greenfox.mysql.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlApplication  implements CommandLineRunner{

  public static void main(String[] args) {
    SpringApplication.run(MysqlApplication.class, args);
  }

  private TodoRepository todoRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public MysqlApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
    this.todoRepository = todoRepository;
    this.assigneeRepository = assigneeRepository;
  }

  @Override
  public void run(String... args) throws Exception {
    /*todoRepository.save(new Todo("Start the day", true, true));
    todoRepository.save(new Todo("Finish H2 workshop 1", "workshop"));
    todoRepository.save(new Todo("Do Xmas shopping", true, true));
    todoRepository.save(new Todo("Go to New Year's Party", "don't forget to bring an xmas present"));*/

   /* assigneeRepository.save(new Assignee(1, "Pisti", "pisti@gmail.com"));
    assigneeRepository.save(new Assignee(2, "Karola", "kircsi@gmail.com"));
    assigneeRepository.save(new Assignee(3, "Mária", "marcsi@gmail.com"));*/
  }
}
