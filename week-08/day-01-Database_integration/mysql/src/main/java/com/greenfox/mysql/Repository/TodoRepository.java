package com.greenfox.mysql.Repository;

import com.greenfox.mysql.Model.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAll();
  List<Todo> findTodoByDoneTrue();
  List<Todo> findAllByDescriptionContainingOrTitleContaining(String description,String title);

}

