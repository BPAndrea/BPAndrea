package com.xmas.sqlagain;

import com.xmas.sqlagain.model.Assignee;
import com.xmas.sqlagain.model.Item;
import com.xmas.sqlagain.repository.AssigneeRepository;
import com.xmas.sqlagain.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlagainApplication implements CommandLineRunner {
  private ItemRepository itemRepository;
  private AssigneeRepository assigneeRepository;

  @Autowired
  public SqlagainApplication(ItemRepository itemRepository,  AssigneeRepository assigneeRepository) {
    this.itemRepository = itemRepository;
    this.assigneeRepository = assigneeRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(SqlagainApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
   /* Assignee nobody = new Assignee("Nobody", "noemail");
    assigneeRepository.save(nobody);
    Assignee andi = new Assignee("Andi", "andi@gmail.com");
    Assignee bela = new Assignee("Béla", "bela@gmail.com");
    Assignee gabor = new Assignee("Gábor", "gabi@gmail.com");
    Assignee dani = new Assignee("Dani", "dani@gmail.com");
   // Assignee nobody = new Assignee("Nobody", "noemail");
    assigneeRepository.save(andi);
    assigneeRepository.save(bela);
    assigneeRepository.save(gabor);
    assigneeRepository.save(dani);
   // assigneeRepository.save(nobody);
    //Assignee toSave = assigneeRepository.findAllByName("Andi");
    itemRepository.save(new Item("xmas", false, true,  assigneeRepository.findAllByName("Andi")) );
    itemRepository.save(new Item("added new one", true, true, assigneeRepository.findAllByName("Béla")));
    itemRepository.save(new Item("created second", false, true, assigneeRepository.findAllByName("Béla")));
    itemRepository.save(new Item("new year's eve", true, true, assigneeRepository.findAllByName("Béla")));
    itemRepository.save(new Item("ori exam", false, true, assigneeRepository.findAllByName("Andi")));
    itemRepository.save(new Item("ori exam", false, true, assigneeRepository.findAllByName("Gábor")));
    itemRepository.save(new Item("foundation exam", true, true, assigneeRepository.findAllByName("Andi")));
    itemRepository.save(new Item("homework", false, false, assigneeRepository.findAllByName("Dani")));
*/
  }
}

