package com.greenfox.api.repository;

import com.greenfox.api.model.Log;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LogRepository extends CrudRepository<Log, Long> {
  List<Log> findAll();
}
