package com.xmas.sqlagain.repository;

import com.xmas.sqlagain.model.Assignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssigneeRepository extends CrudRepository <Assignee, Long>{
  List<Assignee> findAll();

  Assignee findAllByName(String name);


}
