package com.greenfox.reddit.Repository;

import com.greenfox.reddit.Model.Blog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RedditRepository extends CrudRepository<Blog, Long> {
  List<Blog> findAll();

}
