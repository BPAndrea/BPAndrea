package com.example.foxclub.repository;

import com.example.foxclub.model.Fox;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Long> {
  Fox findByName(String name);
  List<Fox> findAll();

/*  @Query(value="select name from fox", nativeQuery=true)
  List<String> findAllByName();*/

}

