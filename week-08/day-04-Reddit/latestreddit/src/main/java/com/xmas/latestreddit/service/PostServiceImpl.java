package com.xmas.latestreddit.service;

import com.xmas.latestreddit.model.Post;
import com.xmas.latestreddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {
  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public List<Post> getAllByLikes() {
    return postRepository.findAllByOrderByLikesDesc();
  }

  @Override
  public void savePost(Post post) {
    postRepository.save(post);
  }

  @Override
  public void upvote(long id) {
    Post upvoted = postRepository.findAllById(id);
    upvoted.setLikes(upvoted.getLikes() + 1);
    //needs to be saved!!!
    postRepository.save(upvoted);
  }


  @Override
  public void downvote(long id) {
    Post downvoted = postRepository.findAllById(id);
    if (downvoted.getLikes() >= 1) {
      downvoted.setLikes(downvoted.getLikes() - 1);
    }
    postRepository.save(downvoted);
  }

}

