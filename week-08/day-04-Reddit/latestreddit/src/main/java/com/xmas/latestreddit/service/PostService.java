package com.xmas.latestreddit.service;

import com.xmas.latestreddit.model.Post;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public interface PostService {
  List<Post> getAllByLikes();
  void savePost(Post post);
  void upvote (long id);
  void downvote (long id);
}
