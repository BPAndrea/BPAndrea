package com.xmas.latestreddit;

import com.xmas.latestreddit.model.Post;
import com.xmas.latestreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LatestredditApplication implements CommandLineRunner {
  private PostRepository postRepository;

  @Autowired
  public LatestredditApplication(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(LatestredditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
   /* postRepository.save(new Post("It works as we intended"));
    postRepository.save(new Post("Polish history in on picture"));
    postRepository.save(new Post("Motion sensors were not installed"));
    postRepository.save(new Post("This sign at my gym"));*/
    //postRepository.save(new Post("Article with timestamp"));
  }
}

