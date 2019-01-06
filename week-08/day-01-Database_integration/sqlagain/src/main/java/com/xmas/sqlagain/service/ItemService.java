package com.xmas.sqlagain.service;

import com.xmas.sqlagain.model.Item;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ItemService {
  List<Item> getAll();
  List<Item> getActive();
  void addItem(Item item);
  void deleteItemById(long id);

  Item findById(Long id);

  Item updateItem(Item item);

  List<Item> findByNameOrDescription(String keyword);
}
