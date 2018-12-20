package com.greenfox.reddit.Service;

import com.greenfox.reddit.Model.Blog;
import com.greenfox.reddit.Repository.RedditRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RedditServiceImpl {
  RedditRepository redditRepository;

  @Autowired
  public RedditServiceImpl(RedditRepository redditRepository) {
    this.redditRepository = redditRepository;
  }

  public List<Blog> listAllBlogs() {
    return redditRepository.findAll();
  }
}
