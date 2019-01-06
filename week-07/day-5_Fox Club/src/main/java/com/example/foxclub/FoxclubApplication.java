package com.example.foxclub;

import com.example.foxclub.model.Fox;
import com.example.foxclub.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxclubApplication implements CommandLineRunner {
  private FoxRepository foxRepository;

  @Autowired
  public FoxclubApplication(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(FoxclubApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    /*foxRepository.save(new Fox("Mr. Green", "salad", "water", 3));
    foxRepository.save(new Fox("Mr. Fox", "pizza", "beer", 3));
    foxRepository.save(new Fox("Mr. Red", "chips", "wine", 3));*/
  }
}

