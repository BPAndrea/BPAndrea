package com.xmas.sqlagain.repository;

import com.xmas.sqlagain.model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
  List<Item> findAll();
  void deleteById(long id);
}
