package com.xmas.sqlagain;

import com.xmas.sqlagain.model.Item;
import com.xmas.sqlagain.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlagainApplication implements CommandLineRunner {
  private ItemRepository itemRepository;

  @Autowired
  public SqlagainApplication(ItemRepository itemRepository) {
    this.itemRepository = itemRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SqlagainApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    itemRepository.save(new Item("added new one", true));
    itemRepository.save(new Item("created second", false));
    itemRepository.save(new Item("new year's eve", true));

  }
}

