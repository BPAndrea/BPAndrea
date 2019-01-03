package com.greenfox.newreddit;

import com.greenfox.newreddit.Model.Post;
import com.greenfox.newreddit.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NewredditApplication implements CommandLineRunner {
  private PostRepository postRepository;

  @Autowired
  NewredditApplication(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(NewredditApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    /*postRepository.save(new Post("It works as we intended it to in Internet Explorer.", ""));
    postRepository.save(new Post("Polish history in on picture"));
    postRepository.save(new Post("Motion sensors were not installed the right way."));
    postRepository.save(new Post("This sign at my gym"));
*/
  }
}

