package com.greenfox.reddit;

import com.greenfox.reddit.Model.Blog;
import com.greenfox.reddit.Repository.RedditRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner {
  RedditRepository redditRepository;

  RedditApplication(RedditRepository redditRepository) {
    this.redditRepository = redditRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(RedditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    redditRepository.save(new Blog(1,"It works as we intended it to in Internet Explorer.",1));
    redditRepository.save(new Blog(2,"Polish history in on picture",1));
    redditRepository.save(new Blog(3,"Motion sensors were not installed the right way.",1));
    redditRepository.save(new Blog(4,"This sign at my gym",1));
  }
}

