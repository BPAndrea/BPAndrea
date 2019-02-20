package com.xmas.sqlagain.service;

import com.xmas.sqlagain.model.Item;
import java.util.List;


public interface ItemService {
  List<Item> getAll();
  List<Item> getActive();
  void addItem(Item item);
  void deleteItemById(long id);

  Item findById(Long id);

  Item updateItem(Item item);

  List<Item> findByNameOrDescription(String keyword);
}
